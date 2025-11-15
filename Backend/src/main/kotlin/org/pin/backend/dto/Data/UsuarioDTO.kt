package org.pin.backend.dto.Data

import org.pin.backend.model.Usuario

data class UsuarioDTO(
    val id: Long,
    val nombre: String,
    val correo: String,
)

fun Usuario.toDTO(): UsuarioDTO =
    UsuarioDTO(
        id = this.id!!,
        nombre = this.nombre,
        correo = this.correo,
    )
