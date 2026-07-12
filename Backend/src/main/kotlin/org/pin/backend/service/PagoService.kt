package org.pin.backend.service
import org.pin.backend.repository.PagoRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class PagoService(
    private val repo: PagoRepository,
) {
    fun findAll() = repo.findAll()
}
