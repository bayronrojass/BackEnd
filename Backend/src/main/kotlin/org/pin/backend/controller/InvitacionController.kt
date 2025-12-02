package org.pin.backend.controller

import jakarta.validation.Valid
import org.pin.backend.dto.Request.AccionInvitacionRequest
import org.pin.backend.dto.Request.InvitacionRequest
import org.pin.backend.dto.Response.InvitacionResponse
import org.pin.backend.dto.Response.toResponse
import org.pin.backend.service.InvitacionService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/invitaciones")
class InvitacionController(
    private val service: InvitacionService,
) {
    @PostMapping
    fun crearInvitacion(
        @RequestBody request: InvitacionRequest,
        // authentication: Authentication
    ): ResponseEntity<InvitacionResponse> {
        val remitenteId = request.remitenteId
        val invitacion = service.crearInvitacion(request.casaId, request.emailDestinatario, remitenteId)

        return ResponseEntity.ok(invitacion.toResponse())
    }

    @GetMapping("/{usuarioId}")
    fun getMisInvitaciones(
        // authentication: Authentication
        @PathVariable usuarioId: Long,
    ): ResponseEntity<List<InvitacionResponse>> {
        val invitaciones = service.getMisInvitacionesPendientes(usuarioId)
        return ResponseEntity.ok(invitaciones.map { it.toResponse() })
    }

    @PostMapping("/{id}/aceptar")
    fun aceptarInvitacion(
        @PathVariable id: Long,
        @Valid @RequestBody request: AccionInvitacionRequest,
        // authentication: Authentication
    ): ResponseEntity<InvitacionResponse> {
        // val userPrincipal = authentication.principal as UserDetailsImpl
        // val usuarioId = userPrincipal.id
        val usuarioId = request.usuarioId

        val invitacion = service.aceptarInvitacion(id, usuarioId)

        return ResponseEntity.ok(invitacion.toResponse())
    }

    @PostMapping("/{id}/rechazar")
    fun rechazarInvitacion(
        @PathVariable id: Long,
        @Valid @RequestBody request: AccionInvitacionRequest,
        // authentication: Authentication
    ): ResponseEntity<InvitacionResponse> {
        // val userPrincipal = authentication.principal as UserDetailsImpl
        // val usuarioId = userPrincipal.id

        val usuarioId = request.usuarioId

        val invitacion = service.rechazarInvitacion(id, usuarioId)

        return ResponseEntity.ok(invitacion.toResponse())
    }
}
