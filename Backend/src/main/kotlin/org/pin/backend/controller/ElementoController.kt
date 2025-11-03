package org.pin.backend.controller
import org.pin.backend.service.ElementoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/elementos")
class ElementoController(
    private val service: ElementoService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
