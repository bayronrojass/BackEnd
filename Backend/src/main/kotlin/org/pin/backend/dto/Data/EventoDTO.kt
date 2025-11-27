package org.pin.backend.dto.Data

import java.time.LocalDateTime
import kotlin.time.ExperimentalTime

data class EventoDTO(
    val id: Long,
    val nombre: String,
    val descripcion: String?,
    val fechaInicio: String,
    val fechaFin: String?,
    val creadoPor: UsuarioDTO,
    val fechaCreacion: String,
    val asistentes: List<UsuarioDTO>
)
