package org.pin.backend.controller

import org.pin.backend.dto.InvitacionRequest
import org.pin.backend.dto.InvitacionResponse
import org.pin.backend.dto.toResponse
import org.pin.backend.security.services.UserDetailsImpl
import org.pin.backend.service.InvitacionService
import org.springframework.http.ResponseEntity
import org.springframework.security.core.Authentication
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/invitaciones")
class InvitacionController(
    private val service: InvitacionService,
) {

    /**
     * Endpoint para ENVIAR una invitación.
     * El 'remitenteId' se obtiene del usuario autenticado.
     */
    @PostMapping
    fun crearInvitacion(
        @RequestBody request: InvitacionRequest,
        authentication: Authentication
    ): ResponseEntity<InvitacionResponse> {

        val userPrincipal = authentication.principal as UserDetailsImpl
        val remitenteId = userPrincipal.id

        // El servicio puede lanzar una excepción si algo falla (ej: usuario no existe)
        // Esa excepción será capturada por el GlobalExceptionHandler
        val invitacion = service.crearInvitacion(request.casaId, request.emailDestinatario, remitenteId)

        return ResponseEntity.ok(invitacion.toResponse())
    }

    /**
     * Endpoint para que el usuario invitado VEA sus invitaciones pendientes.
     * El 'destinatarioId' se obtiene del usuario autenticado.
     */
    @GetMapping("/me")
    fun getMisInvitaciones(
        authentication: Authentication
    ): ResponseEntity<List<InvitacionResponse>> {

        val userPrincipal = authentication.principal as UserDetailsImpl
        val destinatarioId = userPrincipal.id

        val invitaciones = service.getMisInvitacionesPendientes(destinatarioId)

        // Mapea la lista de entidades a una lista de DTOs de respuesta
        return ResponseEntity.ok(invitaciones.map { it.toResponse() })
    }

    /**
     * Endpoint para ACEPTAR una invitación.
     * El 'usuarioId' se obtiene del usuario autenticado para validación.
     */
    @PostMapping("/{id}/aceptar")
    fun aceptarInvitacion(
        @PathVariable id: Long,
        authentication: Authentication
    ): ResponseEntity<InvitacionResponse> {

        val userPrincipal = authentication.principal as UserDetailsImpl
        val usuarioId = userPrincipal.id

        val invitacion = service.aceptarInvitacion(id, usuarioId)

        return ResponseEntity.ok(invitacion.toResponse())
    }

    /**
     * Endpoint para RECHAZAR una invitación.
     * El 'usuarioId' se obtiene del usuario autenticado para validación.
     */
    @PostMapping("/{id}/rechazar")
    fun rechazarInvitacion(
        @PathVariable id: Long,
        authentication: Authentication
    ): ResponseEntity<InvitacionResponse> {

        val userPrincipal = authentication.principal as UserDetailsImpl
        val usuarioId = userPrincipal.id

        // El servicio validará y lanzará excepción si no tiene permiso.
        val invitacion = service.rechazarInvitacion(id, usuarioId)

        return ResponseEntity.ok(invitacion.toResponse())
    }
}