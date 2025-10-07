package org.pin.backend.controller
import org.pin.backend.service.InvitacionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/invitacions")
class InvitacionController(
    private val service: InvitacionService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
