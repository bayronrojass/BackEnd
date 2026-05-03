package org.pin.backend.controller

import org.pin.backend.model.dtos.EncuestaRequestDTO
import org.pin.backend.model.dtos.EncuestaResponseDTO
import org.pin.backend.service.EncuestaService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import jakarta.validation.Valid

@RestController
@RequestMapping("/api")
class EncuestaController(
    private val encuestaService: EncuestaService
) {

    @PostMapping("/casas/{casaId}/encuestas")
    fun crearEncuesta(
        @PathVariable casaId: Long,
        @RequestAttribute("userId") userId: Long,
        @Valid @RequestBody request: EncuestaRequestDTO
    ): ResponseEntity<EncuestaResponseDTO> {
        val nuevaEncuesta = encuestaService.crearEncuestaParaCasa(casaId, userId, request)
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaEncuesta)
    }

    @GetMapping("/casas/{casaId}/encuestas")
    fun obtenerEncuestasDeCasa(
        @PathVariable casaId: Long,
        @RequestAttribute("userId") userId: Long
    ): ResponseEntity<List<EncuestaResponseDTO>> {
        val encuestas = encuestaService.getEncuestasByCasa(casaId, userId)
        return ResponseEntity.ok(encuestas)
    }

    @PostMapping("/encuestas/{encuestaId}/votar/{opcionId}")
    fun votar(
        @PathVariable encuestaId: Long,
        @PathVariable opcionId: Long,
        @RequestAttribute("userId") userId: Long
    ): ResponseEntity<Map<String, String>> {
        encuestaService.votarEnEncuesta(encuestaId, opcionId, userId)
        return ResponseEntity.ok(mapOf("mensaje" to "Voto registrado correctamente"))
    }

    @PutMapping("/encuestas/{encuestaId}/cerrar")
    fun cerrarEncuesta(
        @PathVariable encuestaId: Long,
        @RequestAttribute("userId") userId: Long
    ): ResponseEntity<Map<String, String>> {
        encuestaService.cerrarEncuesta(encuestaId, userId)
        return ResponseEntity.ok(mapOf("mensaje" to "Encuesta cerrada"))
    }
}
