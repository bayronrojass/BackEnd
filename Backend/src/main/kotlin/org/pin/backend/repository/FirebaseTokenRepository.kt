package org.pin.backend.repository

import org.pin.backend.model.FirebaseToken
import org.springframework.data.jpa.repository.JpaRepository

interface FirebaseTokenRepository : JpaRepository<FirebaseToken, Long> {
    fun deleteAllByUsuario_Id(usuarioId: Long): List<FirebaseToken>

    fun findAllByUsuario_Id(usuarioId: Long): List<FirebaseToken>
}
