package org.pin.backend.controller
import org.pin.backend.service.AudioService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/audios")
class AudioController(
    private val service: AudioService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
