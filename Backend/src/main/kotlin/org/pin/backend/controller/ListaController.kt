package org.pin.backend.controller
import org.pin.backend.service.ListaService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/listas")
class ListaController(
    private val service: ListaService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
