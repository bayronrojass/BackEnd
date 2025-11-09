package org.pin.backend.service
import org.pin.backend.repository.ElementoRepository
import org.springframework.stereotype.Service

@Service
class ElementoService(
    private val repo: ElementoRepository,
) {
    fun findAll() = repo.findAll()
}
