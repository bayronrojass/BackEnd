package org.pin.backend.service
import org.pin.backend.repository.LienzoRepository
import org.springframework.stereotype.Service

@Service
class LienzoService(
    private val repo: LienzoRepository,
) {
    fun findAll() = repo.findAll()
}
