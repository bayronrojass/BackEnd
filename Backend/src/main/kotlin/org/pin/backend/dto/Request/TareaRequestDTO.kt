package org.pin.backend.dto.Request

data class TareaRequestDTO(
    val nombre: String,
    val descripcion: String?,
    val completado: Boolean?,
    val fechaFin: String?,
    val frecuencia: String?,
    val periodica: Boolean?,
    val asignadoAId: Long?,
)
