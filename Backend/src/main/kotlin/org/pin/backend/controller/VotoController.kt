package org.pin.backend.controller
import org.pin.backend.service.VotoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/votos")
class VotoController(
    private val service: VotoService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
