package org.pin.backend.controller
import org.pin.backend.service.EventoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/eventos")
class EventoController(
    private val service: EventoService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
