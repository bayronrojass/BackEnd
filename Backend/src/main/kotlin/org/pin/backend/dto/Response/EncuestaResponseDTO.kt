package org.pin.backend.model.dtos

import org.pin.backend.model.EstadoEncuesta
import java.time.LocalDateTime

data class EncuestaResponseDTO(
    val id: Long,
    val titulo: String,
    val creadorNombre: String,
    val estado: EstadoEncuesta,
    val fechaCreacion: LocalDateTime,
    val opciones: List<OpcionResponseDTO>,
    val haVotado: Boolean,
    val colorHex: String,
)

data class OpcionResponseDTO(
    val id: Long,
    val texto: String,
    val totalVotos: Int,
)
