package org.pin.backend.dto

data class ElementoResponseDTO(
    val id: Long,
    val nombre: String,
    val descripcion: String?,
    val completado: Boolean
)