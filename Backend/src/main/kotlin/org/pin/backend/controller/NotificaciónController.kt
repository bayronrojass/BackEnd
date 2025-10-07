package org.pin.backend.controller
import org.pin.backend.service.NotificaciónService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/notificacións")
class NotificaciónController(
    private val service: NotificaciónService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
