package org.pin.backend.service
import org.pin.backend.repository.ResumenRepository
import org.springframework.stereotype.Service

@Service
class ResumenService(
    private val repo: ResumenRepository,
) {
    fun findAll() = repo.findAll()
}
