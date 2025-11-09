package org.pin.backend.service
import org.pin.backend.repository.MultimediaRepository
import org.springframework.stereotype.Service

@Service
class MultimediaService(
    private val repo: MultimediaRepository,
) {
    fun findAll() = repo.findAll()
}
