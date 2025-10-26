package org.pin.backend.repository
import org.pin.backend.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository : JpaRepository<Usuario, Long>{
    fun findByCorreo(correo: String): Usuario? // Busca un Usuario por su campo 'correo'
}
