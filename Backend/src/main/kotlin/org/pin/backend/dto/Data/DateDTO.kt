package org.pin.backend.dto.Data

import java.time.LocalDateTime
import kotlin.time.ExperimentalTime

data class DateDTO(
    @OptIn(ExperimentalTime::class)
    val time: LocalDateTime,
)
