package org.pin.backend.dto.Request

data class ListaRequestDTO(
    val nombre: String,
    val descripcion: String?,
    val participantesIds: List<Long>? = null
)
