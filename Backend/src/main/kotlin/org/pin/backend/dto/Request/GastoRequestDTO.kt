package org.pin.backend.dto.Request

data class GastoRequestDTO(
    val nombre: String,
    val descripcion: String?,
    val importe: Double,
    val categoria: String,
    val pagadoPorId: Long
)