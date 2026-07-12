package org.pin.backend.controller

import jakarta.validation.Valid
import org.pin.backend.model.dtos.EncuestaRequestDTO
import org.pin.backend.model.dtos.EncuestaResponseDTO
import org.pin.backend.service.EncuestaService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class EncuestaController(
    private val encuestaService: EncuestaService,
) {
    @PostMapping("/casa/{casaId}/lista-encuestas")
    fun crearEncuesta(
        @RequestHeader("X-User-Id") userId: Long, // <- Leemos el ID directamente
        @PathVariable casaId: Long,
        @Valid @RequestBody request: EncuestaRequestDTO,
    ): ResponseEntity<EncuestaResponseDTO> {
        val nuevaEncuesta = encuestaService.crearEncuestaParaCasa(casaId, userId, request)
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaEncuesta)
    }

    @GetMapping("/casa/{casaId}/lista-encuestas")
    fun obtenerEncuestasDeCasa(
        @RequestHeader("X-User-Id") userId: Long, // <- Leemos el ID directamente
        @PathVariable casaId: Long,
    ): ResponseEntity<List<EncuestaResponseDTO>> {
        val encuestas = encuestaService.getEncuestasByCasa(casaId, userId)
        return ResponseEntity.ok(encuestas)
    }

    @PostMapping("/encuestas/{encuestaId}/votar-opcion/{opcionId}")
    fun votar(
        @RequestHeader("X-User-Id") userId: Long, // <- Leemos el ID directamente
        @PathVariable encuestaId: Long,
        @PathVariable opcionId: Long,
    ): ResponseEntity<Map<String, String>> {
        encuestaService.votarEnEncuesta(encuestaId, opcionId, userId)
        return ResponseEntity.ok(mapOf("mensaje" to "Voto registrado correctamente"))
    }

    @PutMapping("/encuestas/{encuestaId}/cerrar-encuesta")
    fun cerrarEncuesta(
        @RequestHeader("X-User-Id") userId: Long, // <- Leemos el ID directamente
        @PathVariable encuestaId: Long,
    ): ResponseEntity<Map<String, String>> {
        encuestaService.cerrarEncuesta(encuestaId, userId)
        return ResponseEntity.ok(mapOf("mensaje" to "Encuesta cerrada"))
    }
}
