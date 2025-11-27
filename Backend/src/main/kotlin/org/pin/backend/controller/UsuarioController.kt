package org.pin.backend.controller
import org.pin.backend.dto.Data.UsuarioDTO
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.EventoRepository
import org.pin.backend.repository.GastoRepository
import org.pin.backend.repository.InvitacionRepository
import org.pin.backend.repository.MultimediaRepository
import org.pin.backend.repository.NotificacionRepository
import org.pin.backend.repository.TareaRepository
import org.pin.backend.repository.UsuarioRepository
import org.pin.backend.repository.VotoRepository
import org.pin.backend.service.UsuarioService
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
    private val notificacionRepository: NotificacionRepository,
    private val gastoRepository: GastoRepository,
    private val votoRepository: VotoRepository,
) {
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

        // Limpiar Eventos (Asistente) - Quitar de la lista de asistentes
        val eventosAsistidos = eventoRepository.findByAsistentesContains(usuario)
        for (evento in eventosAsistidos) {
            evento.asistentes.remove(usuario)
            eventoRepository.save(evento)
        }

        // Limpiar Eventos (Creador) - Borrar el evento completo
        // Como 'creadoPor' es obligatorio, si el creador se va, el evento desaparece.
        val eventosCreados = eventoRepository.findByCreadoPor(usuario)
        for (evento in eventosCreados) {
            // A. Buscar la casa dueña del evento
            val casaPropietaria = casaRepository.findByEventosContains(evento).orElse(null)

            // B. Si existe, quitar el evento de la lista de la casa
            if (casaPropietaria != null) {
                casaPropietaria.eventos.remove(evento)
                casaRepository.save(casaPropietaria)
            }

            // Limpiar Invitaciones
            val invitacionesEnviadas = invitacionRepository.findByRemitente(usuario)
            invitacionRepository.deleteAll(invitacionesEnviadas)

            val invitacionesRecibidas = invitacionRepository.findByDestinatario(usuario)
            invitacionRepository.deleteAll(invitacionesRecibidas)

            // Limpiar Multimedia (Imágenes, PostIts, etc.)
            // Buscamos todo lo que el usuario ha subido y lo borramos
            val multimediaUsuario = multimediaRepository.findByUsuario(usuario)
            multimediaRepository.deleteAll(multimediaUsuario)

            // 8. NUEVO: Limpiar Notificaciones (Receptor)
            // Buscamos notificaciones recibidas y quitamos al usuario de la lista
            val notificacionesRecibidas = notificacionRepository.findByReceptorContains(usuario)
            for (notificacion in notificacionesRecibidas) {
                notificacion.receptor.remove(usuario)
                notificacionRepository.save(notificacion)
            }

            // C. Ahora es seguro borrar el evento
            eventoRepository.delete(evento)
        }

        // Limpiar Pagos en Gastos
        // Buscamos los gastos donde el usuario ha realizado algún pago
        val gastosConPagos = gastoRepository.findByPagosPagadoPor(usuario)
        for (gasto in gastosConPagos) {
            // Eliminamos de la lista los pagos hechos por este usuario.
            // Al guardar el gasto, JPA eliminará los pagos de la BD por orphanRemoval=true
            gasto.pagos.removeIf { it.pagadoPor.id == usuario.id }
            gastoRepository.save(gasto)
        }

        // 10. NUEVO: Limpiar Votos en Encuestas
        // Buscamos todos los votos del usuario y los eliminamos.
        // Al no estar ya el voto en la BD, la encuesta dejará de contarlo al cargarse.
        val votosUsuario = votoRepository.findByVotante(usuario)
        votoRepository.deleteAll(votosUsuario)

        // Finalmente, borrar usuario
        usuarioRepository.delete(usuario)

        return ResponseEntity.noContent().build()
    }

    // 1. GET: Devolvemos UsuarioDTO, no la entidad completa
    @GetMapping("/{id}")
    fun getUsuario(
        @PathVariable id: Long,
    ): ResponseEntity<UsuarioDTO> =
        usuarioRepository
            .findById(id)
            .map { usuario ->
                // Convertimos la entidad a DTO antes de enviarla
                val dto = UsuarioDTO(usuario.id!!, usuario.nombre, usuario.correo)
                ResponseEntity.ok(dto)
            }.orElse(ResponseEntity.notFound().build())

    // 2. PUT: Recibimos DTO y devolvemos DTO
    @PutMapping("/{id}")
    @Transactional
    fun updateUsuario(
        @PathVariable id: Long,
        @RequestBody usuarioDto: UsuarioDTO,
    ): ResponseEntity<UsuarioDTO> {
        val usuario =
            usuarioRepository.findById(id).orElse(null)
                ?: return ResponseEntity.notFound().build()

        // Actualizamos los campos
        usuario.nombre = usuarioDto.nombre
        usuario.correo = usuarioDto.correo

        val guardado = usuarioRepository.save(usuario)

        // Devolvemos el DTO actualizado
        val responseDto = UsuarioDTO(guardado.id!!, guardado.nombre, guardado.correo)
        return ResponseEntity.ok(responseDto)
    }
}
