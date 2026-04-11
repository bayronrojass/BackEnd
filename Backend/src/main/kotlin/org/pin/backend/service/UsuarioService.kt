package org.pin.backend.service
import org.pin.backend.dto.Data.UsuarioDTO
import org.pin.backend.repository.UsuarioRepository
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import org.springframework.web.servlet.support.ServletUriComponentsBuilder

@Service
class UsuarioService(
    private val usuarioRepository: UsuarioRepository,
    private val fileStorageService: FileStorageService
) {
    fun findAll() = usuarioRepository.findAll()

    fun actualizarFotoPerfil(id: Long, file: MultipartFile): UsuarioDTO {
        // 1. Buscamos al usuario
        val usuario = usuarioRepository.findById(id)
            .orElseThrow { Exception("Usuario no encontrado") }

        // 2. Guardamos el archivo usando VUESTRO servicio
        val nombreArchivo = fileStorageService.save(file)

        // 3. Montamos la URL pública de forma DINÁMICA (¡La magia!)
        // Esto detecta automáticamente si estás usando localhost, 10.0.2.2 o 192.168.X.X
        val baseUrl = ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString()
        val urlPublica = "$baseUrl/multimedia/$nombreArchivo"

        // 4. Actualizamos el usuario
        usuario.fotoUrl = urlPublica
        val usuarioGuardado = usuarioRepository.save(usuario)

        // 5. Devolvemos el DTO
        return UsuarioDTO(
            id = usuarioGuardado.id!!,
            nombre = usuarioGuardado.nombre,
            correo = usuarioGuardado.correo,
            fotoUrl = usuarioGuardado.fotoUrl
        )
    }

    fun eliminarFotoPerfil(id: Long): UsuarioDTO {
        val usuario = usuarioRepository.findById(id)
            .orElseThrow { Exception("Usuario no encontrado") }

        // Quitamos la referencia a la foto
        usuario.fotoUrl = null
        val usuarioGuardado = usuarioRepository.save(usuario)

        return UsuarioDTO(
            id = usuarioGuardado.id!!,
            nombre = usuarioGuardado.nombre,
            correo = usuarioGuardado.correo,
            fotoUrl = usuarioGuardado.fotoUrl
        )
    }
}
