package org.pin.backend.service
import org.pin.backend.repository.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService(
    private val repo: UsuarioRepository,
) {
    fun findAll() = repo.findAll()
}
