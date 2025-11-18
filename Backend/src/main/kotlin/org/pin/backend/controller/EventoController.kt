package org.pin.backend.controller

import org.pin.backend.dto.Response.EventoResponseDTO
import org.pin.backend.model.Casa
import org.pin.backend.repository.CasaRepository
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import java.time.format.DateTimeFormatter

// ... imports

@RestController
@RequestMapping("/api/casas") // Use consistent API path
class EventoCasaController(
    private val casaRepository: CasaRepository
) {

    @GetMapping("/{casaId}/eventos")
    @Transactional(readOnly = true)
    fun getEventosByCasaId(@PathVariable casaId: Long): ResponseEntity<List<EventoResponseDTO>> {
        val casa = casaRepository.findById(casaId).orElse(null)
            ?: return ResponseEntity.notFound().build()

        val eventosDTO = casa.eventos.map { evento ->
            EventoResponseDTO(
                id = evento.id!!,
                nombre = evento.nombre,
                descripcion = evento.descripcion,
                fechaInicio = evento.fechaInicio.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                fechaFin = evento.fechaFin?.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                creadoPorNombre = evento.creadoPor.nombre
            )
        }
        return ResponseEntity.ok(eventosDTO)
    }
}