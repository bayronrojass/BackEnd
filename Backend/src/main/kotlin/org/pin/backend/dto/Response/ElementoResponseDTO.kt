package org.pin.backend.dto.Response

data class ElementoResponseDTO(
    val id: Long,
    val nombre: String,
    val descripcion: String?,
    val completado: Boolean,
    val cantidad: Int
)
