package org.pin.backend.controller

import org.pin.backend.dto.CasaDTO
import org.pin.backend.dto.LoginRequest
import org.pin.backend.dto.LoginResponse
import org.pin.backend.dto.PisoDTO
import org.pin.backend.dto.UsuarioDTO
import org.pin.backend.model.Usuario
import org.pin.backend.repository.UsuarioRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api") // Base de la API
class AuthController(
    private val usuarioRepository: UsuarioRepository // Inyecta el repositorio
) {

    @PostMapping("/login") // Endpoint que busca el frontend
    @Transactional(readOnly = true)
    fun login(@RequestBody request: LoginRequest): ResponseEntity<LoginResponse> {

        // 1. Buscar usuario por correo
        val usuario: Usuario? = usuarioRepository.findByCorreo(request.correo)

        // 2. Verificar contraseña (!! USAR HASH EN PRODUCCIÓN !!)
        // Aquí deberías comparar con un hash (ej. BCrypt)
        if (usuario == null || usuario.contrasena != request.contrasena) {
            // Error 401 si no coincide
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()
        }

        // 3. Mapear datos a DTOs para la respuesta
        val usuarioDTO = UsuarioDTO(
            id = usuario.id!!, // El ID no será nulo si lo encontramos
            nombre = usuario.nombre,
            correo = usuario.correo
        )

        val casasDTO = usuario.casas.map { casa ->
            CasaDTO(
                id = casa.id!!,
                nombre = casa.nombre,
                descripcion = casa.descripcion,
                rutaImagen = casa.rutaImagen,
                fechaCreacion = casa.fechaCreacion
            )
        }

        // 4. Generar Token (!! USAR JWT EN PRODUCCIÓN !!)
        val token = "token_falso_para_${usuario.id}" // Placeholder

        // 5. Construir la respuesta
        val response = LoginResponse(
            authToken = token,
            flats = casasDTO,
            user = usuarioDTO
        )

        // 6. Enviar respuesta OK (200)
        return ResponseEntity.ok(response)
    }
}