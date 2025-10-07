package org.pin.backend.controller
import org.pin.backend.service.PushService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/pushs")
class PushController(
    private val service: PushService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
