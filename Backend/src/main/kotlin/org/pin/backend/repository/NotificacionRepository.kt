package org.pin.backend.repository
import org.pin.backend.model.Notificacion
import org.pin.backend.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface NotificacionRepository : JpaRepository<Notificacion, Long> {
    fun findByReceptorContains(usuario: Usuario): List<Notificacion>
}
