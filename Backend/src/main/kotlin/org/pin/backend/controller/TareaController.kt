package org.pin.backend.controller
import org.pin.backend.service.TareaService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tareas")
class TareaController(
    private val service: TareaService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
