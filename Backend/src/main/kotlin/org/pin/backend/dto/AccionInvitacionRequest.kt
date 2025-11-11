package org.pin.backend.dto

import jakarta.validation.constraints.Min

data class AccionInvitacionRequest(
    @field:Min(1)
    val usuarioId: Long
)