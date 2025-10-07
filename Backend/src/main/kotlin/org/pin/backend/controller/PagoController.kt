package org.pin.backend.controller
import org.pin.backend.service.PagoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/pagos")
class PagoController(
    private val service: PagoService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
