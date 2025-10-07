package org.pin.backend.controller
import org.pin.backend.service.EncuestaService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/encuestas")
class EncuestaController(
    private val service: EncuestaService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
