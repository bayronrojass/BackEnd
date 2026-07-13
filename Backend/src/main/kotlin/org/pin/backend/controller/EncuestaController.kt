package org.pin.backend.controller

import jakarta.validation.Valid
import org.pin.backend.model.dtos.EncuestaRequestDTO
import org.pin.backend.model.dtos.EncuestaResponseDTO
import org.pin.backend.security.CasaMembershipValidator
import org.pin.backend.service.EncuestaService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/casas")
class EncuestaController(
    private val encuestaService: EncuestaService,
    private val membershipValidator: CasaMembershipValidator,
) {
    @PostMapping("/{casaId}/encuestas")
    @Transactional
    fun crearEncuesta(
        @PathVariable casaId: Long,
        @Valid @RequestBody request: EncuestaRequestDTO,
    ): ResponseEntity<EncuestaResponseDTO> {
        membershipValidator.validateMembership(casaId)
        val userId = membershipValidator.getAuthenticatedUserId()
        val nuevaEncuesta = encuestaService.crearEncuestaParaCasa(casaId, userId, request)
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaEncuesta)
    }

    @GetMapping("/{casaId}/encuestas")
    @Transactional(readOnly = true)
    fun obtenerEncuestasDeCasa(
        @PathVariable casaId: Long,
    ): ResponseEntity<List<EncuestaResponseDTO>> {
        membershipValidator.validateMembership(casaId)
        val userId = membershipValidator.getAuthenticatedUserId()
        val encuestas = encuestaService.getEncuestasByCasa(casaId, userId)
        return ResponseEntity.ok(encuestas)
    }

    @PostMapping("/encuestas/{encuestaId}/votar/{opcionId}")
    @Transactional
    fun votar(
        @PathVariable encuestaId: Long,
        @PathVariable opcionId: Long,
    ): ResponseEntity<Map<String, String>> {
        val userId = membershipValidator.getAuthenticatedUserId()
        encuestaService.votarEnEncuesta(encuestaId, opcionId, userId)
        return ResponseEntity.ok(mapOf("mensaje" to "Voto registrado correctamente"))
    }

    @PutMapping("/encuestas/{encuestaId}/cerrar")
    @Transactional
    fun cerrarEncuesta(
        @PathVariable encuestaId: Long,
    ): ResponseEntity<Map<String, String>> {
        val userId = membershipValidator.getAuthenticatedUserId()
        encuestaService.cerrarEncuesta(encuestaId, userId)
        return ResponseEntity.ok(mapOf("mensaje" to "Encuesta cerrada"))
    }
}
