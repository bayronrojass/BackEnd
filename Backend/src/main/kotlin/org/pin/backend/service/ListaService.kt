package org.pin.backend.service
import org.pin.backend.repository.ListaRepository
import org.springframework.stereotype.Service

@Service
class ListaService(
    private val repo: ListaRepository,
) {
    fun findAll() = repo.findAll()
}
