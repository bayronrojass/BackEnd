package org.pin.backend.dto

import jakarta.validation.constraints.Min

data class JoinCasaRequest(
    @field:Min(1)
    val usuarioId: Long,
)
