package org.pin.backend.controller
import org.pin.backend.service.AudioService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/audios")
class AudioController(
    private val service: AudioService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
