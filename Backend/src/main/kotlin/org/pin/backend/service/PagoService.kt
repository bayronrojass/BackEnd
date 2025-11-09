package org.pin.backend.service
import org.pin.backend.repository.PagoRepository
import org.springframework.stereotype.Service

@Service
class PagoService(
    private val repo: PagoRepository,
) {
    fun findAll() = repo.findAll()
}
