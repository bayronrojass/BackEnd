package org.pin.backend.repository
import org.pin.backend.model.Opcion
import org.springframework.data.jpa.repository.JpaRepository

interface OpcionRepository : JpaRepository<Opcion, Long>
