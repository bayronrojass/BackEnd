package org.pin.backend.repository
import org.pin.backend.model.Pago
import org.springframework.data.jpa.repository.JpaRepository

interface PagoRepository : JpaRepository<Pago, Long>
