package org.pin.backend.dto.Data

import java.math.BigDecimal

data class BorradorGastoDTO(
    val concepto: String,
    val total: BigDecimal,
    val urlTicket: String,
)
