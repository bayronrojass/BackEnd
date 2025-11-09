package org.pin.backend.dto

/**
 * DTO para la respuesta completa del login.
 * Coincide con el LoginResponse.kt del frontend.
 */
data class LoginResponse(
    val authToken: String, // Campo 'token' en el frontend
    val flats: List<CasaDTO>, // Campo 'pisos' en el frontend
    val user: UsuarioDTO, // Campo 'usuario' en el frontend
)
