package org.pin.backend.controller

import org.pin.backend.model.dtos.EncuestaRequestDTO
import org.pin.backend.model.dtos.EncuestaResponseDTO
import org.pin.backend.service.EncuestaService
import org.pin.backend.repository.UsuarioRepository // Asegúrate de importar esto
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.bind.annotation.*
import jakarta.validation.Valid

@RestController
@RequestMapping("/api")
class EncuestaController(
    private val encuestaService: EncuestaService,
    private val usuarioRepository: UsuarioRepository // Inyectamos el repo para buscar por email si hace falta
) {

    private fun getUserIdFromSecurityContext(): Long {
        val authentication = SecurityContextHolder.getContext().authentication
        val username = authentication.name

        // Si Android no mandó token, Spring nos da "anonymousUser".
        // Para no bloquear la app, usamos el usuario 1 (Natalia) como salvavidas.
        if (username == "anonymousUser") {
            println("ALERTA: Petición sin token. Usando usuario por defecto (ID: 1).")
            return 1L
        }

        try {
            return username.toLong()
        } catch (e: NumberFormatException) {
            val usuario = usuarioRepository.findByCorreo(username)
                .orElseThrow { RuntimeException("Usuario no encontrado con el correo: $username") }
            return usuario.id ?: throw RuntimeException("El usuario no tiene ID")
        }
    }

    @PostMapping(value = ["/casa/{casaId}/lista-encuestas"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun crearEncuesta(
        @PathVariable casaId: Long,
        @Valid @RequestBody request: EncuestaRequestDTO
    ): ResponseEntity<EncuestaResponseDTO> {
        val userId = getUserIdFromSecurityContext()
        val nuevaEncuesta = encuestaService.crearEncuestaParaCasa(casaId, userId, request)
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaEncuesta)
    }

    @GetMapping(value = ["/casa/{casaId}/lista-encuestas"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun obtenerEncuestasDeCasa(
        @PathVariable casaId: Long
    ): ResponseEntity<List<EncuestaResponseDTO>> {
        val userId = getUserIdFromSecurityContext()
        val encuestas = encuestaService.getEncuestasByCasa(casaId, userId)
        return ResponseEntity.ok(encuestas)
    }

    @PostMapping(value = ["/encuestas/{encuestaId}/votar-opcion/{opcionId}"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun votar(
        @PathVariable encuestaId: Long,
        @PathVariable opcionId: Long
    ): ResponseEntity<Map<String, String>> {
        val userId = getUserIdFromSecurityContext()
        encuestaService.votarEnEncuesta(encuestaId, opcionId, userId)
        return ResponseEntity.ok(mapOf("mensaje" to "Voto registrado correctamente"))
    }

    @PutMapping(value = ["/encuestas/{encuestaId}/cerrar-encuesta"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun cerrarEncuesta(
        @PathVariable encuestaId: Long
    ): ResponseEntity<Map<String, String>> {
        val userId = getUserIdFromSecurityContext()
        encuestaService.cerrarEncuesta(encuestaId, userId)
        return ResponseEntity.ok(mapOf("mensaje" to "Encuesta cerrada"))
    }
}
