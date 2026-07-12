package org.pin.backend.controller

import org.pin.backend.dto.Data.CasaDTO
import org.pin.backend.dto.Data.UsuarioDTO
import org.pin.backend.dto.Request.LoginRequest
import org.pin.backend.dto.Response.LoginResponse
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

        val usuarioDTO =
            UsuarioDTO(
                id = usuario.id!!,
                nombre = usuario.nombre,
                correo = usuario.correo,
            )

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

        val response =
            LoginResponse(
                authToken = token,
                flats = casasDTO,
                user = usuarioDTO,
            )

        return ResponseEntity.ok(response)
    }
}
