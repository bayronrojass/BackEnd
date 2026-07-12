package org.pin.backend.controller

import org.pin.backend.service.CatalogoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/catalogo")
class CatalogoController(
    private val catalogoService: CatalogoService,
) {
    @GetMapping("/buscar")
    fun buscarProductos(
        @RequestParam("q") query: String,
    ): ResponseEntity<List<CatalogoService.CatalogoDTO>> {
        if (query.isBlank() || query.length < 2) return ResponseEntity.ok(emptyList())
        return ResponseEntity.ok(catalogoService.buscarPredictivo(query))
    }

    @GetMapping("/populares")
    fun obtenerPopulares(): ResponseEntity<List<CatalogoService.CatalogoDTO>> =
        ResponseEntity.ok(catalogoService.obtenerRapidos())
}
