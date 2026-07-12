package org.pin.backend.dto.Request

import java.math.BigDecimal

data class GastoRequestDTO(
    val nombre: String,
    val descripcion: String?,
    val importe: BigDecimal,
    val categoria: String,
    val pagadoPorId: Long,
    val beneficiarios: List<String>? = emptyList(),
    val urlTicket: String? = null,
)
