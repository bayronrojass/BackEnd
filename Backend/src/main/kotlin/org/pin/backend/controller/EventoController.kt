package org.pin.backend.controller
import org.pin.backend.service.EventoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/eventos")
class EventoController(
    private val service: EventoService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
