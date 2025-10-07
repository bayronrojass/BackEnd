package org.pin.backend.controller
import org.pin.backend.service.ImagenService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/imagens")
class ImagenController(
    private val service: ImagenService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
