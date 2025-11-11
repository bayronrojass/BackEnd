package org.pin.backend.controller
import org.pin.backend.dto.Data.UsuarioDTO
import org.pin.backend.dto.Request.TareaRequestDTO
import org.pin.backend.dto.Response.TareaResponseDTO
import org.pin.backend.model.Casa
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.TareaRepository
import org.pin.backend.repository.UsuarioRepository
import org.pin.backend.service.TareaService
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RestController
@RequestMapping("tareas")
class TareaController(
    private val service: TareaService,
    private val tareaRepository: TareaRepository,
    private val usuarioRepository: UsuarioRepository,
    private val casaRepository: CasaRepository,
) {
    @GetMapping
    fun getAll() = service.findAll()

    @PutMapping("/{tareaId}")
    @Transactional
    fun actualizarTarea(
        @PathVariable tareaId: Long,
        @RequestBody request: TareaRequestDTO,
    ): ResponseEntity<TareaResponseDTO> {
        val tarea =
            tareaRepository.findById(tareaId).orElse(null)
                ?: return ResponseEntity.notFound().build()

        request.nombre?.let { tarea.nombre = it }
        request.descripcion?.let { tarea.descripcion = it }
        request.completado?.let { tarea.completado = it }
        tarea.fechaFin =
            when {
                request.fechaFin == null -> tarea.fechaFin // No se actualiza si es null
                request.fechaFin.isBlank() -> null // Se pone a null si es un string vacío
                else -> LocalDateTime.parse(request.fechaFin, DateTimeFormatter.ISO_LOCAL_DATE_TIME) // Se parsea
            }
        request.frecuencia?.let { tarea.frecuencia = it }
        request.periodica?.let { tarea.periodica = it }

        // Actualiza el usuario asignado
        if (request.asignadoAId != null) {
            val usuarioAsignado = usuarioRepository.findById(request.asignadoAId).orElse(null)
            tarea.asignadoA = usuarioAsignado // Asigna el usuario (o null si el ID no existe)
        }

        val tareaGuardada = tareaRepository.save(tarea)

        val responseDTO =
            TareaResponseDTO(
                id = tareaGuardada.id!!,
                nombre = tareaGuardada.nombre,
                descripcion = tareaGuardada.descripcion,
                completado = tareaGuardada.completado,
                fechaFin = tareaGuardada.fechaFin?.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                frecuencia = tareaGuardada.frecuencia,
                periodica = tareaGuardada.periodica,
                asignadoA =
                    tareaGuardada.asignadoA?.let {
                        UsuarioDTO(it.id!!, it.nombre, it.correo)
                    },
            )
        return ResponseEntity.ok(responseDTO)
    }

    @DeleteMapping("/{tareaId}")
    @Transactional
    fun borrarTarea(
        @PathVariable tareaId: Long,
    ): ResponseEntity<Void> {
        val tarea =
            tareaRepository.findById(tareaId).orElse(null)
                ?: return ResponseEntity.notFound().build()

        val casa: Casa? = casaRepository.findByTareasContains(tarea).orElse(null)
        if (casa != null) {
            casa.tareas.remove(tarea)
            casaRepository.save(casa)
        } else {
            tareaRepository.delete(tarea)
        }

        return ResponseEntity.noContent().build()
    }
}
