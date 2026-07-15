package org.pin.backend.dto.Request

data class RegistroRequest(
    val nombre: String,
    val correo: String,
    val contrasena: String,
    val fotoUrl: String? = null,
)
