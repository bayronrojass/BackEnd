package org.pin.backend.repository
import org.pin.backend.model.Resumen
import org.springframework.data.jpa.repository.JpaRepository

interface ResumenRepository : JpaRepository<Resumen, Long>
