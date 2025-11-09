package org.pin.backend.controller
import org.pin.backend.service.ResumenService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/resumenes")
class ResumenController(
    private val service: ResumenService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
