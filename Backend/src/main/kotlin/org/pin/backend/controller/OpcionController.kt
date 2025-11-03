package org.pin.backend.controller
import org.pin.backend.service.OpcionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/opciones")
class OpcionController(
    private val service: OpcionService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
