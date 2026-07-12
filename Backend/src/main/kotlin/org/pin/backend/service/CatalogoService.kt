package org.pin.backend.service

import jakarta.annotation.PostConstruct
import org.pin.backend.model.CatalogoProducto
import org.pin.backend.repository.CatalogoProductoRepository
import org.springframework.stereotype.Service

@Service
class CatalogoService(
    private val repository: CatalogoProductoRepository,
) {
    data class CatalogoDTO(
        val id: Long,
        val nombre: String,
        val categoria: String,
        val iconoKey: String,
    )

    fun buscarPredictivo(query: String): List<CatalogoDTO> =
        repository.buscarPorNombrePredictivo(query).map {
            CatalogoDTO(it.id!!, it.nombre, it.categoria, it.iconoKey)
        }

    fun obtenerRapidos(): List<CatalogoDTO> =
        repository.findTop12ByOrderByIdAsc().map {
            CatalogoDTO(it.id!!, it.nombre, it.categoria, it.iconoKey)
        }

    // --- AUTO-POBLADO DE LA BASE DE DATOS ---
    @PostConstruct
    fun initCatalogo() {
        if (repository.count() == 0L) {
            val productosComunes =
                listOf(
                    CatalogoProducto(nombre = "Leche", categoria = "Lácteos", iconoKey = "ic_leche"),
                    CatalogoProducto(nombre = "Huevos", categoria = "Comidas", iconoKey = "ic_huevos"),
                    CatalogoProducto(nombre = "Pan", categoria = "Panadería", iconoKey = "ic_pan"),
                    CatalogoProducto(nombre = "Papel Higiénico", categoria = "Limpieza", iconoKey = "ic_papel"),
                    CatalogoProducto(nombre = "Detergente", categoria = "Limpieza", iconoKey = "ic_detergente"),
                    CatalogoProducto(nombre = "Bolsas de Basura", categoria = "Limpieza", iconoKey = "ic_bolsas"),
                    CatalogoProducto(nombre = "Aceite de Oliva", categoria = "Despensa", iconoKey = "ic_aceite"),
                    CatalogoProducto(nombre = "Pasta", categoria = "Comidas", iconoKey = "ic_pasta"),
                    CatalogoProducto(nombre = "Arroz", categoria = "Comidas", iconoKey = "ic_arroz"),
                    CatalogoProducto(nombre = "Tomate Frito", categoria = "Comidas", iconoKey = "ic_tomate"),
                    CatalogoProducto(nombre = "Cerveza", categoria = "Bebidas", iconoKey = "ic_cerveza"),
                    CatalogoProducto(nombre = "Agua", categoria = "Bebidas", iconoKey = "ic_agua"),
                )
            repository.saveAll(productosComunes)
        }
    }
}
