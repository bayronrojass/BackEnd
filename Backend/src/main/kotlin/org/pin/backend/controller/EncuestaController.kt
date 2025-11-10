package org.pin.backend.controller
import org.pin.backend.service.EncuestaService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/encuestas")
class EncuestaController(
    private val service: EncuestaService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
