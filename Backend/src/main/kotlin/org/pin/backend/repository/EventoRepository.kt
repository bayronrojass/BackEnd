package org.pin.backend.repository
import org.pin.backend.model.Evento
import org.springframework.data.jpa.repository.JpaRepository

interface EventoRepository : JpaRepository<Evento, Long>
