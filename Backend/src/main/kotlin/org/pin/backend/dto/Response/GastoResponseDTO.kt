package org.pin.backend.dto.Response

data class GastoResponseDTO(
    val id: Long,
    val nombre: String,
    val descripcion: String?,
    val importe: Double,
    val fecha: String,
    val categoria: String,
    val pagadoPorNombre: String,
    val beneficiarios: List<String> = emptyList(),
    val fotoTicketUrl: String? = null
)
