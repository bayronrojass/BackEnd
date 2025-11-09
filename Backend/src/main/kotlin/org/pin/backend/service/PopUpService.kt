package org.pin.backend.service
import org.pin.backend.repository.PopUpRepository
import org.springframework.stereotype.Service

@Service
class PopUpService(
    private val repo: PopUpRepository,
) {
    fun findAll() = repo.findAll()
}
