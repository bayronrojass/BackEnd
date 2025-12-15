package org.pin.backend.service

import jakarta.persistence.EntityNotFoundException
import jakarta.transaction.Transactional
import org.pin.backend.model.FirebaseToken
import org.pin.backend.model.Usuario
import org.pin.backend.repository.FirebaseTokenRepository
import org.pin.backend.repository.UsuarioRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class FirebaseTokenService(
    private val usuarioRepository: UsuarioRepository,
    private val firebaseRepository: FirebaseTokenRepository,
    private val firebaseMessagingService: FirebaseMessagingService,
) {

    val logger: Logger = LoggerFactory.getLogger(FirebaseTokenService::class.java)

    @Transactional
    fun getTokens(userId: Long): List<String> = firebaseRepository.findAllByUsuario_Id(userId).map { it -> it.token }

    @Transactional
    fun procesarToken(
        userId: Long,
        rawToken: String,
    ) {
        val cleanToken = rawToken.replace("\"", "")

        val usuario =
            usuarioRepository
                .findById(userId)
                .orElseThrow { EntityNotFoundException("Usuario no encontrado con id $userId") }

        val tokenExistente = usuario.tokens.find { it.token == cleanToken }

        val tokenAGuardar =
            if (tokenExistente != null) {
                actualizarToken(tokenExistente)
            } else {
                crearNuevoToken(usuario, cleanToken)
            }

        firebaseRepository.save(tokenAGuardar)

        try {
            firebaseMessagingService.enviar(cleanToken, "Test", "Test")
        } catch (e: Exception) {
            logger.error("No se pudo enviar el mensaje de prueba", e)
        }
    }

    private fun actualizarToken(token: FirebaseToken): FirebaseToken {
        token.lastEdited = Instant.now()
        return token
    }

    private fun crearNuevoToken(
        usuario: Usuario,
        tokenString: String,
    ): FirebaseToken {
        gestionarLimiteDeTokens(usuario)

        val nuevoToken =
            FirebaseToken().apply {
                this.usuario = usuario
                this.token = tokenString
                this.lastEdited = Instant.now()
            }

        usuario.tokens.add(nuevoToken)
        usuarioRepository.save(usuario)
        return nuevoToken
    }

    private fun gestionarLimiteDeTokens(usuario: Usuario) {
        if (usuario.tokens.size >= 3) {
            val tokenMasViejo = usuario.tokens.minByOrNull { it.lastEdited }
            if (tokenMasViejo != null) {
                usuario.tokens.remove(tokenMasViejo)
                firebaseRepository.delete(tokenMasViejo)
                logger.info("Límite de tokens alcanzado. Eliminado token antiguo: ${tokenMasViejo.id}")
            }
        }
    }
}
