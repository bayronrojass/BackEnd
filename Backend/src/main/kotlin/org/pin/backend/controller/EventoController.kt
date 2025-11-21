package org.pin.backend.controller

import org.pin.backend.dto.Response.EventoResponseDTO
import org.pin.backend.repository.CasaRepository
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import java.time.format.DateTimeFormatter

@RestController
@RequestMapping("/casas")
class EventoController(
    private val casaRepository: CasaRepository
) {

    @GetMapping("/{casaId}/eventos")
    @Transactional(readOnly = true)
    fun getEventosByCasaId(@PathVariable casaId: Long): ResponseEntity<List<EventoResponseDTO>> {
        println("➡️ Petición recibida: Eventos para casa $casaId")

        val casa = casaRepository.findById(casaId).orElse(null)
        if (casa == null) {
            println("❌ Casa no encontrada")
            return ResponseEntity.notFound().build()
        }

        try {
            val eventosDTO = casa.eventos.map { evento ->
                EventoResponseDTO(
                    id = evento.id ?: 0,
                    nombre = evento.nombre ?: "Sin nombre",
                    descripcion = evento.descripcion,
                    fechaInicio = evento.fechaInicio.toString(),
                    fechaFin = evento.fechaFin?.toString(),
                    creadoPorNombre = evento.creadoPor?.nombre ?: "Sistema"
                )
            }
            println("✅ Enviando ${eventosDTO.size} eventos")
            return ResponseEntity.ok(eventosDTO)
        } catch (e: Exception) {
            println("🔥 ERROR al mapear eventos: ${e.message}")
            e.printStackTrace()
            return ResponseEntity.internalServerError().build()
        }
    }
}