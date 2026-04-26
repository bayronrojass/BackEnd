package org.pin.backend.controller
import org.pin.backend.dto.Data.UsuarioDTO
import org.pin.backend.dto.Request.TareaRequestDTO
import org.pin.backend.dto.Response.TareaResponseDTO
import org.pin.backend.model.Casa
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.TareaRepository
import org.pin.backend.repository.UsuarioRepository
import org.pin.backend.service.FirebaseMessagingService
import org.pin.backend.service.LogroService
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
    private val firebaseMessagingService: FirebaseMessagingService,
    private val logroService: LogroService,
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

        val estabaCompletada = tarea.completado

        request.nombre.let { tarea.nombre = it }
        request.descripcion?.let { tarea.descripcion = it }
        request.completado?.let { tarea.completado = it }
        tarea.fechaFin =
            when {
                request.fechaFin == null -> tarea.fechaFin
                request.fechaFin.isBlank() -> null
                else -> LocalDateTime.parse(request.fechaFin, DateTimeFormatter.ISO_LOCAL_DATE_TIME)
            }
        request.frecuencia?.let { tarea.frecuencia = it }
        request.periodica?.let { tarea.periodica = it }
        request.prioridad?.let { tarea.prioridad = it }

        if (request.asignadoAId != null) {
            if (request.asignadoAId == -1L) {
                tarea.asignadoA = null
            } else {
                val usuarioAsignado = usuarioRepository.findById(request.asignadoAId).orElse(null)
                tarea.asignadoA = usuarioAsignado
            }
        }

        val tareaGuardada = tareaRepository.save(tarea)
        if (request.asignadoAId != request.creadoPor) {
            firebaseMessagingService.enviarAUsuario(request.asignadoAId!!, "¡Nueva tarea asignada!", request.nombre)
        }

        if (request.completado == true && !estabaCompletada) {
            val usuarioAsignadoId = tareaGuardada.asignadoA?.id
            if (usuarioAsignadoId != null) {
                val diasRetraso = if (tareaGuardada.fechaFin != null) {
                    java.time.temporal.ChronoUnit.DAYS.between(tareaGuardada.fechaFin, LocalDateTime.now())
                } else {
                    0L
                }
                logroService.procesarTareaCompletada(usuarioAsignadoId, diasRetraso)
            }
        }

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
                prioridad = tareaGuardada.prioridad,
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

    @PutMapping("/{tareaId}/notify")
    @Transactional
    fun notificarTarea(
        @PathVariable tareaId: Long,
    ): ResponseEntity<Void> {
        val tarea =
            tareaRepository.findById(tareaId).orElse(null)
                ?: return ResponseEntity.notFound().build()
        if (tarea.asignadoA != null) {
            firebaseMessagingService.enviarAUsuario(
                tarea.asignadoA!!.id!!,
                "¡Recordatorio de tarea!",
                "Que no se te pase " + tarea.nombre,
            )
            firebaseMessagingService.enviarAUsuario(1, "¡Recordatorio de tarea!", "Que no se te pase " + tarea.nombre)
            return ResponseEntity.ok().build()
        } else {
            return ResponseEntity.badRequest().build()
        }
    }
}
