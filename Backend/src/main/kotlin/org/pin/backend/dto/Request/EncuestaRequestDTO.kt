package org.pin.backend.model.dtos

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class EncuestaRequestDTO(
    @field:NotBlank(message = "El título es obligatorio")
    @field:Size(max = 50)
    val titulo: String,
    val opciones: List<String>,
    val colorHex: String
)
