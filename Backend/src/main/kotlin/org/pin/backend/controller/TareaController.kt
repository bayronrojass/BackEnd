package org.pin.backend.controller
import org.pin.backend.service.TareaService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tareas")
class TareaController(
    private val service: TareaService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
