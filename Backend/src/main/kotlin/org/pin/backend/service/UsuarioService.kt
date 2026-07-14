package org.pin.backend.service

import jakarta.persistence.EntityNotFoundException
import org.pin.backend.dto.Data.UsuarioDTO
import org.pin.backend.model.Usuario
import org.pin.backend.repository.UsuarioRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.multipart.MultipartFile
import org.springframework.web.servlet.support.ServletUriComponentsBuilder

@Service
@Transactional
class UsuarioService(
    private val usuarioRepository: UsuarioRepository,
    private val fileStorageService: FileStorageService,
) {
    @Transactional(readOnly = true)
    fun findAll() = usuarioRepository.findAll()

    fun actualizarFotoPerfil(
        id: Long,
        file: MultipartFile,
    ): UsuarioDTO {
        val usuario =
            usuarioRepository
                .findById(id)
                .orElseThrow { EntityNotFoundException("Usuario no encontrado") }

        val nombreArchivo = fileStorageService.save(file)
        usuario.fotoUrl = buildAbsoluteUrl(nombreArchivo)

        return usuario.toDto()
    }

    fun eliminarFotoPerfil(id: Long): UsuarioDTO {
        val usuario =
            usuarioRepository
                .findById(id)
                .orElseThrow { EntityNotFoundException("Usuario no encontrado") }

        usuario.fotoUrl = null
        return usuario.toDto()
    }

    private fun buildAbsoluteUrl(filename: String): String {
        val baseUrl =
            ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .build()
                .toUriString()
        return "$baseUrl/multimedia/$filename"
    }

    private fun Usuario.toDto(): UsuarioDTO =
        UsuarioDTO(
            id = id!!,
            nombre = nombre,
            correo = correo,
            fotoUrl = fotoUrl,
        )
}
