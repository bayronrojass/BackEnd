package org.pin.backend.repository
import org.pin.backend.model.Gasto
import org.pin.backend.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface GastoRepository : JpaRepository<Gasto, Long>{
    fun findByPagosPagadoPor(usuario: Usuario): List<Gasto>
}
