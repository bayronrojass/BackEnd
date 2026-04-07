package org.pin.backend.controller

import jakarta.persistence.EntityNotFoundException
import org.pin.backend.dto.Data.CasaDTO
import org.pin.backend.dto.Data.UsuarioDTO
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.EventoRepository
import org.pin.backend.repository.FirebaseTokenRepository
import org.pin.backend.repository.GastoRepository
import org.pin.backend.repository.InvitacionRepository
import org.pin.backend.repository.MultimediaRepository
import org.pin.backend.repository.TareaRepository
import org.pin.backend.repository.UsuarioRepository
import org.pin.backend.repository.VotoRepository
import org.pin.backend.service.FirebaseTokenService
import org.pin.backend.service.UsuarioService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/usuarios")
class UsuarioController(
    private val service: UsuarioService,
    private val usuarioRepository: UsuarioRepository,
    private val casaRepository: CasaRepository,
    private val eventoRepository: EventoRepository,
    private val tareaRepository: TareaRepository,
    private val invitacionRepository: InvitacionRepository,
    private val multimediaRepository: MultimediaRepository,
    private val gastoRepository: GastoRepository,
    private val votoRepository: VotoRepository,
    private val firebaseRepository: FirebaseTokenRepository,
    private val firebaseTokenService: FirebaseTokenService,
) {
    private val logger: Logger = LoggerFactory.getLogger(UsuarioController::class.java)

    @GetMapping
    fun getAll() = service.findAll()

    @DeleteMapping("/{id}")
    @Transactional
    fun deleteUsuario(
        @PathVariable id: Long,
    ): ResponseEntity<Void> {
        val usuario =
            usuarioRepository.findById(id).orElse(null)
                ?: return ResponseEntity.notFound().build()

        // Limpiar Casas (Administradores)
        val casasAdmin = casaRepository.findByAdministradoresContains(usuario)
        for (casa in casasAdmin) {
            casa.administradores.remove(usuario)
            casaRepository.save(casa)
        }

        // Limpiar Casas (Miembros)
        val casasMiembro = casaRepository.findByMiembrosContains(usuario)
        for (casa in casasMiembro) {
            casa.miembros.remove(usuario)
            casaRepository.save(casa)
        }

        // Limpiar Tareas (Desasignar, no borrar la tarea)
        val tareasAsignadas = tareaRepository.findByAsignadoA(usuario)
        for (tarea in tareasAsignadas) {
            tarea.asignadoA = null
            tareaRepository.save(tarea)
        }

        // Limpiar Eventos
        val eventosAsistidos = eventoRepository.findByAsistentesContains(usuario)
        for (evento in eventosAsistidos) {
            evento.asistentes.remove(usuario)
            eventoRepository.save(evento)
        }

        // Limpiar Eventos
        val eventosCreados = eventoRepository.findByCreadoPor(usuario)
        for (evento in eventosCreados) {
            val casaPropietaria = casaRepository.findByEventosContains(evento).orElse(null)
            if (casaPropietaria != null) {
                casaPropietaria.eventos.remove(evento)
                casaRepository.save(casaPropietaria)
            }

            val invitacionesEnviadas = invitacionRepository.findByRemitente(usuario)
            invitacionRepository.deleteAll(invitacionesEnviadas)

            val invitacionesRecibidas = invitacionRepository.findByDestinatario(usuario)
            invitacionRepository.deleteAll(invitacionesRecibidas)

            val multimediaUsuario = multimediaRepository.findByUsuario(usuario)
            multimediaRepository.deleteAll(multimediaUsuario)

            eventoRepository.delete(evento)
        }

        val gastosConPagos = gastoRepository.findByPagosPagadoPor(usuario)
        for (gasto in gastosConPagos) {
            gasto.pagos.removeIf { it.pagadoPor.id == usuario.id }
            gastoRepository.save(gasto)
        }

        firebaseRepository.deleteAllByUsuario_Id(usuario.id!!)

        // Limpiar Votos en Encuestas
        val votosUsuario = votoRepository.findByVotante(usuario)
        votoRepository.deleteAll(votosUsuario)

        usuarioRepository.delete(usuario)

        return ResponseEntity.noContent().build()
    }

    @GetMapping("/{id}")
    fun getUsuario(
        @PathVariable id: Long,
    ): ResponseEntity<UsuarioDTO> =
        usuarioRepository
            .findById(id)
            .map { usuario ->
                val dto = UsuarioDTO(usuario.id!!, usuario.nombre, usuario.correo)
                ResponseEntity.ok(dto)
            }.orElse(ResponseEntity.notFound().build())

    @PutMapping("/{id}")
    @Transactional
    fun updateUsuario(
        @PathVariable id: Long,
        @RequestBody usuarioDto: UsuarioDTO,
    ): ResponseEntity<UsuarioDTO> {
        val usuario =
            usuarioRepository.findById(id).orElse(null)
                ?: return ResponseEntity.notFound().build()

        usuario.nombre = usuarioDto.nombre
        usuario.correo = usuarioDto.correo

        val guardado = usuarioRepository.save(usuario)

        val responseDto = UsuarioDTO(guardado.id!!, guardado.nombre, guardado.correo)
        return ResponseEntity.ok(responseDto)
    }

    @PutMapping("/{id}/token")
    fun updateUsuarioToken(
        @PathVariable id: Long,
        @RequestBody token: String,
    ): ResponseEntity<Void> =
        try {
            firebaseTokenService.procesarToken(id, token)
            ResponseEntity.ok().build()
        } catch (e: EntityNotFoundException) {
            ResponseEntity.notFound().build()
        } catch (e: Exception) {
            ResponseEntity.internalServerError().build()
        }

    @GetMapping("/{id}/casas")
    fun getCasasDeUsuario(@PathVariable id: Long): ResponseEntity<List<CasaDTO>> {
        val usuario = usuarioRepository.findById(id).orElse(null)
            ?: return ResponseEntity.notFound().build()

        val casasDelUsuario = casaRepository.findByMiembrosContains(usuario)

        val casasDto = casasDelUsuario.map { casa ->
            CasaDTO(
                id = casa.id!!,
                nombre = casa.nombre,
                descripcion = casa.descripcion,
                rutaImagen = casa.rutaImagen,
                fechaCreacion = casa.fechaCreacion
            )
        }

        return ResponseEntity.ok(casasDto)
    }
}
