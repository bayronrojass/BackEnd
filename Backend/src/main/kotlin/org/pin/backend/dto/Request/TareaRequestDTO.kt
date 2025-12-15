package org.pin.backend.dto.Request

data class TareaRequestDTO(
    val nombre: String = "",
    val descripcion: String? = null,
    val completado: Boolean? = false,
    val fechaFin: String? = "",
    val frecuencia: String? = "",
    val periodica: Boolean? = false,
    val asignadoAId: Long? = null,
    val prioridad: String? = null,
    val creadoPor: Long? = 0L,
)
