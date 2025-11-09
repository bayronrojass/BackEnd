package org.pin.backend.controller
import org.pin.backend.service.MultimediaService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/multimedias")
class MultimediaController(
    private val service: MultimediaService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
