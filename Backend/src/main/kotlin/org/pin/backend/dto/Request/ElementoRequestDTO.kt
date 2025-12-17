package org.pin.backend.dto.Request

data class ElementoRequestDTO(
    val nombre: String,
    val descripcion: String?,
    val completado: Boolean?,
    val cantidad: Int? = 1
)
