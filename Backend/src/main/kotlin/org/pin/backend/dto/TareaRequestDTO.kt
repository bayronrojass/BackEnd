package org.pin.backend.dto

import java.time.LocalDateTime

data class TareaRequestDTO(
    val nombre: String,
    val descripcion: String?,
    val completado: Boolean?,
    val fechaFin: LocalDateTime?,
    val frecuencia: String?,
    val periodica: Boolean?,
    val asignadoAId: Long?
)