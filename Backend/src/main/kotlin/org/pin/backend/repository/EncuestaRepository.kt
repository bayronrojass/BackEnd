package org.pin.backend.repository

import org.pin.backend.model.Encuesta
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RestResource

@RestResource(exported = false)
interface EncuestaRepository : JpaRepository<Encuesta, Long> {
    @Query("SELECT e FROM Encuesta e WHERE e.casa.id = :casaId")
    fun findByCasaId(
        @Param("casaId") casaId: Long,
    ): List<Encuesta>

    @Query(
        "SELECT DISTINCT e FROM Encuesta e " +
            "LEFT JOIN FETCH e.creador " +
            "LEFT JOIN FETCH e.opciones o " +
            "LEFT JOIN FETCH o.votos v " +
            "LEFT JOIN FETCH v.votante " +
            "WHERE e.casa.id = :casaId",
    )
    fun findByCasaIdWithDetails(
        @Param("casaId") casaId: Long,
    ): List<Encuesta>
}
