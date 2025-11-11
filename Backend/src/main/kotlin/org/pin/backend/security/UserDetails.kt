package org.pin.backend.security.services

import com.fasterxml.jackson.annotation.JsonIgnore
import org.pin.backend.model.Usuario
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

// Esta clase "envuelve" tu entidad Usuario para que Spring Security la entienda
class UserDetailsImpl(
    val id: Long,
    val nombre: String,
    val email: String,
    @JsonIgnore
    private val contrasenaHash: String,
    private val authorities: Collection<GrantedAuthority> = emptyList(),
) : UserDetails {
    companion object {
        // Un método útil para construir esto desde tu entidad
        fun build(usuario: Usuario): UserDetailsImpl =
            UserDetailsImpl(
                id = usuario.id!!,
                nombre = usuario.nombre,
                email = usuario.correo,
                contrasenaHash = usuario.contrasena,
            )
    }

    // --- Implementación de la interfaz UserDetails ---
    override fun getAuthorities(): Collection<GrantedAuthority> = authorities

    override fun getPassword(): String = contrasenaHash

    override fun getUsername(): String = email // El email se usa como "username"

    override fun isAccountNonExpired(): Boolean = true

    override fun isAccountNonLocked(): Boolean = true

    override fun isCredentialsNonExpired(): Boolean = true

    override fun isEnabled(): Boolean = true
}
