package org.pin.backend.dto

import java.time.LocalDateTime
import  org.pin.backend.model.Usuario
data class CasaDetailsResponseDTO(
    val id: Long,
    val nombre: String,
    val descripcion: String?,
    val miembros: List<Usuario>, // Asumiendo que tu @Entity Usuario es segura para enviar
    val administradores: List<Usuario>
)
