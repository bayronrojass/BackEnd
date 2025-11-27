package org.pin.backend.dto.Request

import java.time.LocalDateTime
import org.springframework.format.annotation.DateTimeFormat

data class EventoRequestDTO(
    val nombre: String,
    val descripcion: String? = null,
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    val fechaInicio: LocalDateTime,
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    val fechaFin: LocalDateTime? = null,
    val creadoPor: Long
)
