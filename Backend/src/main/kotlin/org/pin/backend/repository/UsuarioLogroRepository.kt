package org.pin.backend.repository

import org.pin.backend.model.Logro
import org.pin.backend.model.Usuario
import org.pin.backend.model.UsuarioLogro
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioLogroRepository : JpaRepository<UsuarioLogro, Long> {
    fun findByUsuarioAndLogro(
        usuario: Usuario,
        logro: Logro,
    ): UsuarioLogro?

    fun findByUsuarioId(usuarioId: Long): List<UsuarioLogro>
}
