package org.pin.backend.controller
import org.pin.backend.service.MultimediaService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/multimedias")
class MultimediaController(
    private val service: MultimediaService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
