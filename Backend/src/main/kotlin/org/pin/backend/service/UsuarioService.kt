package org.pin.backend.service
import org.pin.backend.dto.Data.UsuarioDTO
import org.pin.backend.repository.UsuarioRepository
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import org.springframework.web.servlet.support.ServletUriComponentsBuilder

@Service
class UsuarioService(
    private val usuarioRepository: UsuarioRepository,
    private val fileStorageService: FileStorageService,
) {
    fun findAll() = usuarioRepository.findAll()

    fun actualizarFotoPerfil(
        id: Long,
        file: MultipartFile,
    ): UsuarioDTO {
        val usuario =
            usuarioRepository
                .findById(id)
                .orElseThrow { Exception("Usuario no encontrado") }

        val nombreArchivo = fileStorageService.save(file)

        val baseUrl = ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString()
        val urlPublica = "$baseUrl/multimedia/$nombreArchivo"

        usuario.fotoUrl = urlPublica
        val usuarioGuardado = usuarioRepository.save(usuario)

        return UsuarioDTO(
            id = usuarioGuardado.id!!,
            nombre = usuarioGuardado.nombre,
            correo = usuarioGuardado.correo,
            fotoUrl = usuarioGuardado.fotoUrl,
        )
    }

    fun eliminarFotoPerfil(id: Long): UsuarioDTO {
        val usuario =
            usuarioRepository
                .findById(id)
                .orElseThrow { Exception("Usuario no encontrado") }

        usuario.fotoUrl = null
        val usuarioGuardado = usuarioRepository.save(usuario)

        return UsuarioDTO(
            id = usuarioGuardado.id!!,
            nombre = usuarioGuardado.nombre,
            correo = usuarioGuardado.correo,
            fotoUrl = usuarioGuardado.fotoUrl,
        )
    }
}
