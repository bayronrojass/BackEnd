package org.pin.backend.repository

import org.pin.backend.model.Encuesta
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RestResource // Importante

// Esto le dice a Spring Data REST: "No toques este repositorio, lo manejo yo en el Controller"
@RestResource(exported = false)
interface EncuestaRepository : JpaRepository<Encuesta, Long> {

    @Query("SELECT e FROM Encuesta e WHERE e.id IN (SELECT m.id FROM Multimedia m WHERE m.casa.id = :casaId)")
    fun findByCasaId(@Param("casaId") casaId: Long): List<Encuesta>
}
