package org.pin.backend.repository

import org.pin.backend.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UsuarioRepository : JpaRepository<Usuario, Long> {
    fun findByCorreo(correo: String): Optional<Usuario>
}
