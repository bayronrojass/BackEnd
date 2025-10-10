package org.pin.backend.controller
import org.pin.backend.service.ResumenService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/resumenes")
class ResumenController(
    private val service: ResumenService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
