package org.pin.backend.controller

import org.pin.backend.dto.Data.CasaDTO
import org.pin.backend.dto.Data.toDTO
import org.pin.backend.dto.Request.LoginRequest
import org.pin.backend.dto.Request.RegistroRequest
import org.pin.backend.dto.Response.LoginResponse
import org.pin.backend.model.Usuario
import org.pin.backend.repository.UsuarioRepository
import org.pin.backend.security.JwtService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping()
class AuthController(
    private val usuarioRepository: UsuarioRepository,
    private val passwordEncoder: PasswordEncoder,
    private val jwtService: JwtService,
) {
    @PostMapping("/login")
    @Transactional(readOnly = true)
    fun login(
        @RequestBody request: LoginRequest,
    ): ResponseEntity<LoginResponse> {
        val usuario =
            usuarioRepository
                .findByCorreo(request.correo)
                .orElse(null)

        if (usuario == null || !passwordEncoder.matches(request.contrasena, usuario.contrasena)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()
        }

        val casasDTO =
            usuario.casas.map { casa ->
                CasaDTO(
                    id = casa.id!!,
                    nombre = casa.nombre,
                    descripcion = casa.descripcion,
                    rutaImagen = casa.rutaImagen,
                    fechaCreacion = casa.fechaCreacion,
                )
            }

        val token = jwtService.generateToken(usuario.id!!, usuario.correo)

        return ResponseEntity.ok(
            LoginResponse(
                authToken = token,
                flats = casasDTO,
                user = usuario.toDTO(),
            ),
        )
    }

    @PostMapping("/api/auth/register")
    @Transactional
    fun register(
        @RequestBody request: RegistroRequest,
    ): ResponseEntity<LoginResponse> {
        if (request.nombre.isBlank() || request.correo.isBlank() || request.contrasena.isBlank()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build()
        }

        if (usuarioRepository.findByCorreo(request.correo).isPresent) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build()
        }

        val nuevoUsuario =
            Usuario(
                nombre = request.nombre.trim(),
                correo = request.correo.trim(),
                contrasena = passwordEncoder.encode(request.contrasena),
                fotoUrl = request.fotoUrl,
                puntosConvivencia = 0,
            )

        val guardado = usuarioRepository.save(nuevoUsuario)
        val token = jwtService.generateToken(guardado.id!!, guardado.correo)

        return ResponseEntity.status(HttpStatus.CREATED).body(
            LoginResponse(
                authToken = token,
                flats = emptyList(),
                user = guardado.toDTO(),
            ),
        )
    }
}
