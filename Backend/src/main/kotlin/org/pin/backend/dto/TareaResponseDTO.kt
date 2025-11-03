package org.pin.backend.dto

import java.time.LocalDateTime

data class TareaResponseDTO(
    val id: Long,
    val nombre: String,
    val descripcion: String?,
    val completado: Boolean,
    val fechaFin: String?,
    val frecuencia: String?,
    val periodica: Boolean,
    val asignadoA: UsuarioDTO?
)