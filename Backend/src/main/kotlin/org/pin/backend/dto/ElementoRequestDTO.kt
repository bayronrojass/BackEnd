package org.pin.backend.dto

data class ElementoRequestDTO(
    val nombre: String,
    val descripcion: String?,
    val completado: Boolean?
)
