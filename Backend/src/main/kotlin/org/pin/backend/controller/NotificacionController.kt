package org.pin.backend.controller
import org.pin.backend.service.NotificacionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/notificaciones")
class NotificacionController(
    private val service: NotificacionService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
