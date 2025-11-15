package org.pin.backend.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

// DTO simple para una respuesta de error
data class ErrorResponse(
    val status: Int,
    val message: String?,
)

/**
 * Esta clase intercepta excepciones de TODOS los controladores
 * y las formatea como una respuesta JSON.
 */
@ControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(Exception::class)
    fun handleGenericException(e: Exception): ResponseEntity<ErrorResponse> {
        val status =
            when {
                e.message?.contains("permiso") == true -> HttpStatus.FORBIDDEN // 403
                e.message?.contains("no encontrado") == true -> HttpStatus.NOT_FOUND // 404
                e.message?.contains("ya es miembro") == true -> HttpStatus.CONFLICT // 409
                e.message?.contains("ya existe") == true -> HttpStatus.CONFLICT // 409
                else -> HttpStatus.BAD_REQUEST // 400
            }

        val errorResponse = ErrorResponse(status.value(), e.message)
        return ResponseEntity.status(status).body(errorResponse)
    }
}
