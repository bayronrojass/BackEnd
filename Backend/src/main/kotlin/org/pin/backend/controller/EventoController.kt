package org.pin.backend.controller

import org.pin.backend.dto.Request.EventoRequestDTO
import org.pin.backend.dto.Response.EventoResponseDTO
import org.pin.backend.model.Evento
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.EventoRepository
import org.pin.backend.service.EventoService
import org.pin.backend.service.FirebaseMessagingService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import java.util.Optional

@RestController
@RequestMapping("/casas")
class EventoController(
    private val casaRepository: CasaRepository,
    private val eventoRepository: EventoRepository,
    private val service: EventoService,
    private val firebaseMessagingService: FirebaseMessagingService,
) {
    private val logger: Logger = LoggerFactory.getLogger(EventoController::class.java)

    @GetMapping("/{casaId}/eventos")
    @Transactional(readOnly = true)
    fun getEventosByCasaId(
        @PathVariable casaId: Long,
    ): ResponseEntity<List<EventoResponseDTO>> {
        val casa =
            casaRepository.findByIdWithEventos(casaId)
                ?: return ResponseEntity.notFound().build()

        try {
            val eventosDTO =
                casa.eventos.map { evento ->
                    EventoResponseDTO(
                        id = evento.id ?: throw IllegalStateException("Event ID cannot be null"),
                        nombre = evento.nombre,
                        descripcion = evento.descripcion,
                        fechaCreacion = evento.fechaCreacion.toString(),
                        fechaInicio = evento.fechaInicio.toString(),
                        fechaFin = evento.fechaFin?.toString(),
                        creadoPor = evento.creadoPor.id ?: throw IllegalStateException("Creator ID cannot be null"),
                        asistentes =
                            evento.asistentes.map {
                                it.id
                                    ?: throw IllegalStateException("Attendee ID cannot be null")
                            },
                    )
                }
            return ResponseEntity.ok(eventosDTO)
        } catch (e: Exception) {
            logger.error("Error fetching events for house $casaId", e)
            return ResponseEntity.internalServerError().build()
        }
    }

    @PostMapping("/{casaId}/eventos", consumes = ["application/json"])
    fun crearEvento(
        @PathVariable casaId: Long,
        @RequestBody request: EventoRequestDTO,
    ): ResponseEntity<EventoResponseDTO> {
        try {
            val eventoGuardado = service.crearEvento(casaId, request)
            val responseDTO =
                EventoResponseDTO(
                    id = eventoGuardado.id ?: throw IllegalStateException("Event ID cannot be null"),
                    nombre = eventoGuardado.nombre,
                    descripcion = eventoGuardado.descripcion,
                    fechaCreacion = eventoGuardado.fechaCreacion.toString(),
                    fechaInicio = eventoGuardado.fechaInicio.toString(),
                    fechaFin = eventoGuardado.fechaFin?.toString(),
                    creadoPor = eventoGuardado.creadoPor.id ?: throw IllegalStateException("Creator ID cannot be null"),
                    asistentes =
                        eventoGuardado.asistentes.map {
                            it.id
                                ?: throw IllegalStateException("Attendee ID cannot be null")
                        },
                )
            return ResponseEntity.ok(responseDTO)
        } catch (e: Exception) {
            logger.error("Error creating event for house $casaId", e)
            return ResponseEntity.badRequest().build()
        }
    }

    @DeleteMapping("/eventos/{eventoId}")
    @Transactional
    fun borrarEvento(
        @PathVariable eventoId: Long,
    ): ResponseEntity<Void> {
        val evento = eventoRepository.findById(eventoId).orElse(null)
        if (evento == null) {
            return ResponseEntity.notFound().build()
        }

        try {
            val casaConEvento =
                casaRepository.findAll().find { casa ->
                    casa.eventos.any { it.id == eventoId }
                }

            if (casaConEvento != null) {
                casaConEvento.eventos.remove(evento)
                casaRepository.save(casaConEvento)
            }

            eventoRepository.delete(evento)
            return ResponseEntity.noContent().build()
        } catch (e: Exception) {
            logger.error("Error deleting event $eventoId", e)
            return ResponseEntity.internalServerError().build()
        }
    }

    @PutMapping("/eventos/{eventoId}")
    @Transactional
    fun actualizarEvento(
        @PathVariable eventoId: Long,
        @RequestBody request: EventoRequestDTO,
    ): ResponseEntity<EventoResponseDTO> {
        val eventoOptional: Optional<Evento> = eventoRepository.findById(eventoId)
        if (eventoOptional.isEmpty) {
            return ResponseEntity.notFound().build()
        }

        try {
            val evento = eventoOptional.get()
            request.nombre.let { evento.nombre = it }
            request.descripcion?.let { evento.descripcion = it }
            request.fechaInicio.let { evento.fechaInicio = it }
            request.fechaFin?.let { evento.fechaFin = it }
            val nuevosInvitados = evento.asistentes // TODO: No se ven los nuevos invitados
            for (invitado in nuevosInvitados) {
                firebaseMessagingService.enviarAUsuario(
                    invitado.id!!,
                    "Te han invitado a un evento",
                    "¡Preparate para la fiesta!",
                )
            }

            val eventoActualizado = eventoRepository.save(evento)

            val responseDTO =
                EventoResponseDTO(
                    id = eventoActualizado.id!!,
                    nombre = eventoActualizado.nombre,
                    descripcion = eventoActualizado.descripcion,
                    fechaCreacion = eventoActualizado.fechaCreacion.toString(),
                    fechaInicio = eventoActualizado.fechaInicio.toString(),
                    fechaFin = eventoActualizado.fechaFin?.toString(),
                    creadoPor = eventoActualizado.creadoPor.id!!,
                    asistentes = eventoActualizado.asistentes.map { it.id!! },
                )
            return ResponseEntity.ok(responseDTO)
        } catch (e: Exception) {
            logger.error("Error updating event $eventoId", e)
            return ResponseEntity.internalServerError().build()
        }
    }
}
