package org.pin.backend.dto.Response

import java.time.LocalDateTime

data class CasaResponseDTO(
    val id: Long,
    val nombre: String,
    val descripcion: String?,
    val fechaCreacion: LocalDateTime,
)
