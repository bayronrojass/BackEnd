package org.pin.backend.configs

import org.pin.backend.repository.UsuarioRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class PasswordMigrator(
    private val usuarioRepository: UsuarioRepository,
    private val passwordEncoder: PasswordEncoder,
) : ApplicationRunner {
    @Transactional
    override fun run(args: ApplicationArguments?) {
        val usuarios = usuarioRepository.findAll()
        for (usuario in usuarios) {
            val isBcrypt =
                usuario.contrasena.startsWith("${'$'}2a${'$'}") ||
                    usuario.contrasena.startsWith("${'$'}2b${'$'}")
            if (!isBcrypt) {
                usuario.contrasena = passwordEncoder.encode(usuario.contrasena)
                usuarioRepository.save(usuario)
            }
        }
    }
}
