package org.pin.backend.model

data class CasaRequestDTO(
    val nombre: String,
    val descripcion: String?,
    val rutaImagen: String?
)