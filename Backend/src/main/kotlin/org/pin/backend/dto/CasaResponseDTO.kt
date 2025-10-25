package org.pin.backend.model

data class CasaRequest(
    val nombre: String,
    val descripcion: String?,
    val rutaImagen: String?
)