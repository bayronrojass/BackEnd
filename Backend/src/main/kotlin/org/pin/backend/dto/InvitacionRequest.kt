package org.pin.backend.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank


data class InvitacionRequest(

    @field:Min(value = 1, message = "El ID de la casa no puede ser nulo o menor que 1")
    val casaId: Long,

    @field:NotBlank(message = "El email del destinatario no puede estar vacío")
    @field:Email(message = "Debe ser un formato de email válido")
    val emailDestinatario: String
)