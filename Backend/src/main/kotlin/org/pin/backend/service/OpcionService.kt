package org.pin.backend.service
import org.pin.backend.repository.OpcionRepository
import org.springframework.stereotype.Service

@Service
class OpcionService(
    private val repo: OpcionRepository,
) {
    fun findAll() = repo.findAll()
}
