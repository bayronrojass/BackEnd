package org.pin.backend.dto

import java.time.LocalDateTime
import kotlin.time.ExperimentalTime

data class DateDTO(
    @OptIn(ExperimentalTime::class)
    val time: LocalDateTime,
)
