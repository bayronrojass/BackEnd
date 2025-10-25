package org.pin.backend.service
import org.pin.backend.repository.AudioRepository
import org.springframework.stereotype.Service

@Service
class AudioService(
    private val repo: AudioRepository,
) {
    fun findAll() = repo.findAll()
}
