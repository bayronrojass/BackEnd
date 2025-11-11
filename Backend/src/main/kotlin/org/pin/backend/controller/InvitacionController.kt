package org.pin.backend.controller

import org.pin.backend.dto.Request.InvitacionRequest
import org.pin.backend.dto.Response.InvitacionResponse
import org.pin.backend.dto.Response.toResponse
import org.pin.backend.security.services.UserDetailsImpl // Asumo que tienes esto de Spring Security
import org.pin.backend.service.InvitacionService
import org.springframework.http.ResponseEntity
import org.springframework.security.core.Authentication
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/invitaciones")
class InvitacionController(
    private val service: InvitacionService,
) {
    @PostMapping
    fun crearInvitacion(
        @RequestBody request: InvitacionRequest,
        authentication: Authentication,
    ): ResponseEntity<InvitacionResponse> {
        val userPrincipal = authentication.principal as UserDetailsImpl
        val remitenteId = userPrincipal.id

        // El servicio lanzará excepciones si algo falla (capturadas por GlobalExceptionHandler)
        val invitacion = service.crearInvitacion(request.casaId, request.emailDestinatario, remitenteId)

        return ResponseEntity.ok(invitacion.toResponse())
    }

    @GetMapping("/me")
    fun getMisInvitaciones(authentication: Authentication): ResponseEntity<List<InvitacionResponse>> {
        val userPrincipal = authentication.principal as UserDetailsImpl
        val destinatarioId = userPrincipal.id

        val invitaciones = service.getMisInvitacionesPendientes(destinatarioId)

        return ResponseEntity.ok(invitaciones.map { it.toResponse() })
    }

    @PostMapping("/{id}/aceptar")
    fun aceptarInvitacion(
        @PathVariable id: Long,
        authentication: Authentication,
    ): ResponseEntity<InvitacionResponse> {
        val userPrincipal = authentication.principal as UserDetailsImpl
        val usuarioId = userPrincipal.id

        val invitacion = service.aceptarInvitacion(id, usuarioId)

        return ResponseEntity.ok(invitacion.toResponse())
    }

    @PostMapping("/{id}/rechazar")
    fun rechazarInvitacion(
        @PathVariable id: Long,
        authentication: Authentication,
    ): ResponseEntity<InvitacionResponse> {
        val userPrincipal = authentication.principal as UserDetailsImpl
        val usuarioId = userPrincipal.id

        val invitacion = service.rechazarInvitacion(id, usuarioId)

        return ResponseEntity.ok(invitacion.toResponse())
    }
}
