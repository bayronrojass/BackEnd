package org.pin.backend.dto.Data

import java.time.LocalDateTime

data class CasaDTO(
    val id: Long,
    val nombre: String,
    val descripcion: String?,
    val rutaImagen: String?,
    val fechaCreacion: LocalDateTime,
)
