package org.pin.backend.service
import org.pin.backend.repository.CasaRepository
import org.springframework.stereotype.Service

@Service
class CasaService(
    private val repo: CasaRepository,
) {
    fun findAll() = repo.findAll()
}
