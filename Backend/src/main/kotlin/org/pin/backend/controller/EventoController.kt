package org.pin.backend.controller

import org.pin.backend.dto.Request.EventoRequestDTO
import org.pin.backend.dto.Response.EventoResponseDTO
import org.pin.backend.security.CasaMembershipValidator
import org.pin.backend.service.EventoService
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/casas")
class EventoController(
    private val eventoService: EventoService,
    private val membershipValidator: CasaMembershipValidator,
) {
    private val logger = LoggerFactory.getLogger(EventoController::class.java)

    @GetMapping("/{casaId}/eventos")
    @Transactional(readOnly = true)
    fun getEventosByCasaId(
        @PathVariable casaId: Long,
    ): ResponseEntity<List<EventoResponseDTO>> {
        membershipValidator.validateMembership(casaId)
        val eventos =
            eventoService.getEventosByCasaId(casaId)
                ?: return ResponseEntity.notFound().build()
        return ResponseEntity.ok(eventos)
    }

    @PostMapping("/{casaId}/eventos", consumes = ["application/json"])
    @Transactional
    fun crearEvento(
        @PathVariable casaId: Long,
        @RequestBody request: EventoRequestDTO,
    ): ResponseEntity<EventoResponseDTO> {
        membershipValidator.validateMembership(casaId)
        try {
            val eventoGuardado = eventoService.crearEvento(casaId, request)
            val responseDTO =
                EventoResponseDTO(
                    id = eventoGuardado.id!!,
                    nombre = eventoGuardado.nombre,
                    descripcion = eventoGuardado.descripcion,
                    fechaCreacion = eventoGuardado.fechaCreacion.toString(),
                    fechaInicio = eventoGuardado.fechaInicio.toString(),
                    fechaFin = eventoGuardado.fechaFin?.toString(),
                    creadoPor = eventoGuardado.creadoPor.id!!,
                    asistentes = eventoGuardado.asistentes.map { it.id!! },
                )
            return ResponseEntity.ok(responseDTO)
        } catch (e: IllegalArgumentException) {
            logger.error("Error creating event for house $casaId", e)
            return ResponseEntity.badRequest().build()
        }
    }

    @DeleteMapping("/eventos/{eventoId}")
    @Transactional
    fun borrarEvento(
        @PathVariable eventoId: Long,
    ): ResponseEntity<Void> {
        if (!eventoService.borrarEvento(eventoId)) {
            return ResponseEntity.notFound().build()
        }
        return ResponseEntity.noContent().build()
    }

    @PutMapping("/eventos/{eventoId}")
    @Transactional
    fun actualizarEvento(
        @PathVariable eventoId: Long,
        @RequestBody request: EventoRequestDTO,
    ): ResponseEntity<EventoResponseDTO> {
        val response =
            eventoService.actualizarEvento(eventoId, request)
                ?: return ResponseEntity.notFound().build()
        return ResponseEntity.ok(response)
    }
}
