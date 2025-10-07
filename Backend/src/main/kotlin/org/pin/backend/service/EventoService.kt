package org.pin.backend.service
import org.pin.backend.repository.EventoRepository
import org.springframework.stereotype.Service

@Service
class EventoService(
    private val repo: EventoRepository,
) {
    fun findAll() = repo.findAll()
}
