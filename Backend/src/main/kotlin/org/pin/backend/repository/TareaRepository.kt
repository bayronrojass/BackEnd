package org.pin.backend.repository

import org.pin.backend.model.Tarea
import org.pin.backend.model.Usuario
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface TareaRepository : JpaRepository<Tarea, Long> {
    fun findByAsignadoA(usuario: Usuario): List<Tarea>

    @Query(
        value =
            "SELECT t FROM Tarea t " +
                "LEFT JOIN FETCH t.asignadoA " +
                "WHERE t.casa.id = :casaId",
        countQuery = "SELECT COUNT(t) FROM Tarea t WHERE t.casa.id = :casaId",
    )
    fun findByCasaIdPaged(
        casaId: Long,
        pageable: Pageable,
    ): Page<Tarea>

    @Query(
        value =
            "SELECT t FROM Tarea t " +
                "LEFT JOIN FETCH t.asignadoA " +
                "WHERE t.casa.id = :casaId AND t.completado = :completado",
        countQuery =
            "SELECT COUNT(t) FROM Tarea t " +
                "WHERE t.casa.id = :casaId AND t.completado = :completado",
    )
    fun findByCasaIdAndCompletadoPaged(
        casaId: Long,
        completado: Boolean,
        pageable: Pageable,
    ): Page<Tarea>
}
