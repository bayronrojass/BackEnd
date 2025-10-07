package org.pin.backend.controller
import org.pin.backend.service.VotoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/votos")
class VotoController(
    private val service: VotoService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
