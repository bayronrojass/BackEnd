package org.pin.backend.controller
import org.pin.backend.service.PushService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pushes")
class PushController(
    private val service: PushService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
