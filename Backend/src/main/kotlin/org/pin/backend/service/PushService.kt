package org.pin.backend.service
import org.pin.backend.repository.PushRepository
import org.springframework.stereotype.Service

@Service
class PushService(
    private val repo: PushRepository,
) {
    fun findAll() = repo.findAll()
}
