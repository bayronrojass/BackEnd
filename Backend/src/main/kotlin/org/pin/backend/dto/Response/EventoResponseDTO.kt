package org.pin.backend.dto.Response

data class EventoResponseDTO(
    val id: Long,
    val nombre: String,
    val descripcion: String?,
    val fechaInicio: String, // ISO Date Time string
    val fechaFin: String?,
    val creadoPorNombre: String
)