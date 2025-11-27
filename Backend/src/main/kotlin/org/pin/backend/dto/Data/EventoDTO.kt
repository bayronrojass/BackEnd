package org.pin.backend.dto.Data

data class EventoDTO(
    val id: Long,
    val nombre: String,
    val descripcion: String?,
    val fechaInicio: String,
    val fechaFin: String?,
    val creadoPor: UsuarioDTO,
    val fechaCreacion: String,
    val asistentes: List<UsuarioDTO>,
)
