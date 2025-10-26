package org.pin.backend.model // O donde prefieras poner tus DTOs

import java.time.LocalDateTime

// Esta clase es lo que el servidor devolverá al frontend
data class CasaResponseDTO(
    val id: Long,
    val nombre: String,
    val descripcion: String?,
    val fechaCreacion: LocalDateTime,
)
