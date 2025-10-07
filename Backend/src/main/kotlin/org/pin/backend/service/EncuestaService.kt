package org.pin.backend.service
import org.pin.backend.repository.EncuestaRepository
import org.springframework.stereotype.Service

@Service
class EncuestaService(
    private val repo: EncuestaRepository,
) {
    fun findAll() = repo.findAll()
}
