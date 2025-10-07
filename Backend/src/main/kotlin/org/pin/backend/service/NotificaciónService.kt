package org.pin.backend.service
import org.pin.backend.repository.NotificaciónRepository
import org.springframework.stereotype.Service

@Service
class NotificaciónService(
    private val repo: NotificaciónRepository,
) {
    fun findAll() = repo.findAll()
}
