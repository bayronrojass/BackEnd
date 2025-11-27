package org.pin.backend.service
import org.pin.backend.repository.NotificacionRepository
import org.springframework.stereotype.Service

@Service
class NotificacionService(
    private val repo: NotificacionRepository,
) {
    fun findAll() = repo.findAll()
}
