package org.pin.backend.dto.Response

import org.pin.backend.dto.Data.UsuarioDTO

data class ListaResponseDTO(
    val id: Long,
    val nombre: String,
    val descripcion: String?,
    val fechaCreacion: String?,
    val fechaEdicion: String?,
    val propietario: UsuarioDTO?,
    val participantes: List<UsuarioDTO> = emptyList(),
)
