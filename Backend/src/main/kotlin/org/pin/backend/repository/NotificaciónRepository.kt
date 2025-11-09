package org.pin.backend.repository
import org.pin.backend.model.Notificacion
import org.springframework.data.jpa.repository.JpaRepository

interface NotificaciónRepository : JpaRepository<Notificacion, Long>
