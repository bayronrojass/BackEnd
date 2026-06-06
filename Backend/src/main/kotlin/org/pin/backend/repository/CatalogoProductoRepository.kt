package org.pin.backend.repository

import org.pin.backend.model.CatalogoProducto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface CatalogoProductoRepository : JpaRepository<CatalogoProducto, Long> {
    @Query("SELECT c FROM CatalogoProducto c WHERE LOWER(c.nombre) LIKE LOWER(CONCAT('%', :query, '%'))")
    fun buscarPorNombrePredictivo(query: String): List<CatalogoProducto>

    fun findTop12ByOrderByIdAsc(): List<CatalogoProducto>
}
