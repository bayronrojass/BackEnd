package org.pin.backend.service
import org.pin.backend.repository.VotoRepository
import org.springframework.stereotype.Service

@Service
class VotoService(
    private val repo: VotoRepository,
) {
    fun findAll() = repo.findAll()
}
