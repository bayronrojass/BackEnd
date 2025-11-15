package org.pin.backend.dto.Response

import org.pin.backend.model.Invitacion
import org.pin.backend.model.enums.EstadoInvitacion

data class InvitacionResponse(
    val id: Long,
    val estado: EstadoInvitacion,
    val casaId: Long,
    val casaNombre: String,
    val remitenteNombre: String,
    val destinatarioEmail: String,
)

fun Invitacion.toResponse(): InvitacionResponse =
    InvitacionResponse(
        id = this.id!!,
        estado = this.estado,
        casaId = this.casa.id!!,
        casaNombre = this.casa.nombre,
        remitenteNombre = this.remitente.nombre,
        destinatarioEmail = this.destinatario.correo,
    )
