package org.pin.backend.controller
import org.pin.backend.service.PopUpService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/popups")
class PopUpController(
    private val service: PopUpService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
