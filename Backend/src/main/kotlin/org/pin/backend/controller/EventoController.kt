package org.pin.backend.controller

import org.pin.backend.service.EventoService
import org.pin.backend.dto.Request.EventoRequestDTO
import org.pin.backend.dto.Response.EventoResponseDTO
import org.springframework.web.bind.annotation.*
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.pin.backend.repository.CasaRepository
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional

@RestController
@RequestMapping("/casas")
class EventoController(
    private val casaRepository: CasaRepository,
    private val service: EventoService
) {

    private val logger: Logger = LoggerFactory.getLogger(EventoController::class.java)

    @GetMapping("/{casaId}/eventos")
    @Transactional(readOnly = true)
    fun getEventosByCasaId(@PathVariable casaId: Long): ResponseEntity<List<EventoResponseDTO>> {
        val casa = casaRepository.findById(casaId).orElse(null)
        if (casa == null) {
            return ResponseEntity.notFound().build()
        }

        try {
            val eventosDTO = casa.eventos.map { evento ->
                EventoResponseDTO(
                    id = evento.id ?: throw IllegalStateException("Event ID cannot be null"),
                    nombre = evento.nombre,
                    descripcion = evento.descripcion,
                    fechaCreacion = evento.fechaCreacion.toString(),
                    fechaInicio = evento.fechaInicio.toString(),
                    fechaFin = evento.fechaFin?.toString(),
                    creadoPor = evento.creadoPor.id ?: throw IllegalStateException("Creator ID cannot be null"),
                    asistentes = evento.asistentes.map { it.id ?: throw IllegalStateException("Attendee ID cannot be null") }
                )
            }
            return ResponseEntity.ok(eventosDTO)
        } catch (e: Exception) {
            e.printStackTrace()
            return ResponseEntity.internalServerError().build()
        }
    }

    @PostMapping("/{casaId}/eventos", consumes = ["application/json"])
    fun crearEvento(
        @PathVariable casaId: Long,
        @RequestBody request: EventoRequestDTO
    ): EventoResponseDTO {
        val eventoGuardado = service.crearEvento(casaId, request)
        return EventoResponseDTO(
            id = eventoGuardado.id ?: throw IllegalStateException("Event ID cannot be null"),
            nombre = eventoGuardado.nombre,
            descripcion = eventoGuardado.descripcion,
            fechaCreacion = eventoGuardado.fechaCreacion.toString(),
            fechaInicio = eventoGuardado.fechaInicio.toString(),
            fechaFin = eventoGuardado.fechaFin?.toString(),
            creadoPor = eventoGuardado.creadoPor.id ?: throw IllegalStateException("Creator ID cannot be null"),
            asistentes = eventoGuardado.asistentes.map { it.id ?: throw IllegalStateException("Attendee ID cannot be null") }
        )
    }
}
