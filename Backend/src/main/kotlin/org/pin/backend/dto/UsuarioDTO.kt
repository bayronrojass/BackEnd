package org.pin.backend.dto

/**
 * DTO para enviar los datos públicos del usuario.
 * Coincide con el modelo Usuario.kt del frontend.
 */
data class UsuarioDTO(
    val id: Long,
    val nombre: String,
    val correo: String
)