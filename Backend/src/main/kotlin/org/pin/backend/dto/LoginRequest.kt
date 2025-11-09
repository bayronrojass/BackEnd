package org.pin.backend.dto

/**
 * DTO para recibir las credenciales de inicio de sesión.
 * Coincide con el LoginRequest.kt del frontend.
 */
data class LoginRequest(
    val correo: String,
    val contrasena: String,
)
