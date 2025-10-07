package org.pin.backend.service
import org.pin.backend.repository.PostItRepository
import org.springframework.stereotype.Service

@Service
class PostItService(
    private val repo: PostItRepository,
) {
    fun findAll() = repo.findAll()
}
