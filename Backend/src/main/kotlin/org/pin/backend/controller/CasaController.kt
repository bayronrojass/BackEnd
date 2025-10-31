package org.pin.backend.controller

import org.pin.backend.dto.CasaRequestDTO
import org.pin.backend.dto.CasaResponseDTO
import org.pin.backend.dto.CasaDetailsResponseDTO // <-- Importar DTO nuevo
import org.pin.backend.dto.ListaRequestDTO
import org.pin.backend.model.Casa
import org.pin.backend.model.Lista
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.ListaRepository
import org.pin.backend.repository.UsuarioRepository // <-- Importar Repo nuevo
import org.pin.backend.service.CasaService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import java.util.*

@RestController
@RequestMapping("/api/casas")
class CasaController(
    private val service: CasaService,
    private val casaRepository: CasaRepository,
    private val usuarioRepository: UsuarioRepository,
    private val listaRepository: ListaRepository
) {
    @GetMapping
    fun getAll() = service.findAll()

    @PostMapping(consumes = ["multipart/form-data"])
    fun crearCasa(
        @RequestPart("casa") request: CasaRequestDTO,
        @RequestPart("file", required = false) file: MultipartFile?
    ): CasaResponseDTO {

        val casaGuardada = if (file != null && !file.isEmpty) {
            service.crearNuevaCasa(request, file)
        } else {
            service.crearNuevaCasaSinImagen(request)
        }

        return CasaResponseDTO(
            id = casaGuardada.id!!,
            nombre = casaGuardada.nombre,
            descripcion = casaGuardada.descripcion,
            fechaCreacion = casaGuardada.fechaCreacion
        )
    }

    @GetMapping("/{casaId}/listas")
    @Transactional(readOnly = true)
    fun getListasByCasaId(@PathVariable casaId: Long): ResponseEntity<List<Lista>> {
        val casaOptional: Optional<Casa> = casaRepository.findById(casaId)
        return if (casaOptional.isPresent) {
            val casa = casaOptional.get()
            // Accedemos a casa.listas DENTRO de la transacción
            ResponseEntity.ok(casa.listas.toList())
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @GetMapping("/{id}/details")
    @Transactional(readOnly = true)
    fun getCasaDetails(@PathVariable id: Long): ResponseEntity<CasaDetailsResponseDTO> {
        return casaRepository.findById(id).map { casa ->
            val dto = CasaDetailsResponseDTO(
                id = casa.id!!,
                nombre = casa.nombre,
                descripcion = casa.descripcion,
                miembros = casa.miembros.toList(),
                administradores = casa.administradores.toList()
            )
            ResponseEntity.ok(dto)
        }.orElse(ResponseEntity.notFound().build())
    }


    @DeleteMapping("/{casaId}/miembros/{usuarioId}")
    @Transactional
    fun removeMiembro(
        @PathVariable casaId: Long,
        @PathVariable usuarioId: Long
        // TODO: Añadir Spring Security para verificar que quien llama es un admin
    ): ResponseEntity<Unit> {
        val casa = casaRepository.findById(casaId)
            .orElseThrow { Exception("Casa no encontrada") }

        val usuario = usuarioRepository.findById(usuarioId)
            .orElseThrow { Exception("Usuario no encontrado") }

        if (casa.miembros.contains(usuario)) {
            casa.miembros.remove(usuario)
        }
        if (casa.administradores.contains(usuario)) {
            casa.administradores.remove(usuario)
        }

        casaRepository.save(casa)
        return ResponseEntity.ok().build()
    }

    @PostMapping("/{casaId}/listas")
    @Transactional
    fun crearListaEnCasa(
        @PathVariable casaId: Long,
        @RequestBody request: ListaRequestDTO
    ): ResponseEntity<Lista> {
        val casaOptional: Optional<Casa> = casaRepository.findById(casaId)
        if (casaOptional.isEmpty) {
            return ResponseEntity.notFound().build()
        }

        val casa = casaOptional.get()

        // 1. Crea la nueva entidad Lista
        val nuevaLista = Lista(
            nombre = request.nombre,
            descripcion = request.descripcion
        )

        // 2. Guarda la Lista PRIMERO para obtener su ID
        val listaGuardada = listaRepository.save(nuevaLista)

        // 3. Añade la lista (ya con ID) a la casa
        casa.listas.add(listaGuardada)

        // 4. Guarda la casa para actualizar la relación
        casaRepository.save(casa)

        // 5. Devuelve la lista CON ID
        return ResponseEntity.status(HttpStatus.CREATED).body(listaGuardada)
    }
}