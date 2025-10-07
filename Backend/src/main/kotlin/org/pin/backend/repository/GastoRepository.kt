package org.pin.backend.repository
import org.pin.backend.model.Gasto
import org.springframework.data.jpa.repository.JpaRepository

interface GastoRepository : JpaRepository<Gasto, Long>
