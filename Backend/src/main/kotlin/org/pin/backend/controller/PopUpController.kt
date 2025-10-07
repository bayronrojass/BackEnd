package org.pin.backend.controller
import org.pin.backend.service.PopUpService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/popups")
class PopUpController(
    private val service: PopUpService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
