package org.pin.backend.controller
import org.pin.backend.service.PagoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pagos")
class PagoController(
    private val service: PagoService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
