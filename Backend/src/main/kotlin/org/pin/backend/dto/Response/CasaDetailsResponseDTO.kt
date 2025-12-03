package org.pin.backend.dto.Response

import org.pin.backend.model.Usuario

data class CasaDetailsResponseDTO(
    val id: Long,
    val nombre: String,
    val descripcion: String?,
)
