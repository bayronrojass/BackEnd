package org.pin.backend.controller
import org.pin.backend.service.LienzoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/lienzos")
class LienzoController(
    private val service: LienzoService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
