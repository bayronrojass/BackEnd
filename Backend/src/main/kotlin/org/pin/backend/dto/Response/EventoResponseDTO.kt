package org.pin.backend.dto.Response

data class EventoResponseDTO(
    val id: Long,
    val nombre: String,
    val descripcion: String?,
    val fechaInicio: String,
    val fechaFin: String?,
    val creadoPor: Long,
    val fechaCreacion: String,
    val asistentes: List<Long>,
)
