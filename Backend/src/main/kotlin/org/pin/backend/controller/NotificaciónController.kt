package org.pin.backend.controller
import org.pin.backend.service.NotificaciónService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/notificaciones")
class NotificaciónController(
    private val service: NotificaciónService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
