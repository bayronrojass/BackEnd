package org.pin.backend.controller
import org.pin.backend.service.NotificaciónService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/notificaciones")
class NotificaciónController(
    private val service: NotificaciónService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
