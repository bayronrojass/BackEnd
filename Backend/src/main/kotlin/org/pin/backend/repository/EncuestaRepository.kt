package org.pin.backend.repository
import org.pin.backend.model.Encuesta
import org.springframework.data.jpa.repository.JpaRepository

interface EncuestaRepository : JpaRepository<Encuesta, Long>
