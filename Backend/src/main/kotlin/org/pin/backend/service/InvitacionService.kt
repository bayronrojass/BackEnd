package org.pin.backend.service

import org.pin.backend.repository.InvitacionRepository
import org.springframework.stereotype.Service

@Service
class InvitacionService(private val repo: InvitacionRepository) {
    fun findAll() = repo.findAll()
}