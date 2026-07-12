package org.pin.backend.repository
import org.pin.backend.model.Elemento
import org.pin.backend.model.Lista
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface ListaRepository : JpaRepository<Lista, Long> {
    fun findByElementosContains(elemento: Elemento): Optional<Lista>

    fun findByCasaId(casaId: Long): List<Lista>

    @Query(
        "SELECT DISTINCT l FROM Lista l " +
            "LEFT JOIN FETCH l.propietario " +
            "LEFT JOIN FETCH l.participantes " +
            "WHERE l.casa.id = :casaId",
    )
    fun findByCasaIdWithDetails(casaId: Long): List<Lista>
}
