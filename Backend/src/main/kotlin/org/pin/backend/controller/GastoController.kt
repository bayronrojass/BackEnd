package org.pin.backend.controller
import org.pin.backend.service.GastoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/gastos")
class GastoController(
    private val service: GastoService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
