package org.pin.backend.dto.Request

import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime

data class EventoRequestDTO(
    val nombre: String,
    val descripcion: String? = null,
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    val fechaInicio: LocalDateTime,
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    val fechaFin: LocalDateTime? = null,
    val creadoPor: Long,
)
