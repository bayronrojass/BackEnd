package org.pin.backend.controller
import org.pin.backend.service.ImagenService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/imagenes")
class ImagenController(
    private val service: ImagenService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
