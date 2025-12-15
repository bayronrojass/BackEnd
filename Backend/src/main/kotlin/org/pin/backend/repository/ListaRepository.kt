package org.pin.backend.repository
import org.pin.backend.model.Elemento
import org.pin.backend.model.Lista
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ListaRepository : JpaRepository<Lista, Long> {
    fun findByElementosContains(elemento: Elemento): Optional<Lista>

    fun findByCasaId(casaId: Long): List<Lista>
}
