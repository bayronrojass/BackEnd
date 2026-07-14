package org.pin.backend.repository

import org.pin.backend.model.Gasto
import org.pin.backend.model.Usuario
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface GastoRepository : JpaRepository<Gasto, Long> {
    fun findByPagosPagadoPor(usuario: Usuario): List<Gasto>

    @Query(
        value =
            "SELECT g FROM Gasto g " +
                "LEFT JOIN FETCH g.pagadoPor " +
                "WHERE g IN (SELECT gc FROM Casa c JOIN c.gastos gc WHERE c.id = :casaId)",
        countQuery =
            "SELECT COUNT(g) FROM Gasto g " +
                "WHERE g IN (SELECT gc FROM Casa c JOIN c.gastos gc WHERE c.id = :casaId)",
    )
    fun findByCasaIdPaged(
        casaId: Long,
        pageable: Pageable,
    ): Page<Gasto>
}
