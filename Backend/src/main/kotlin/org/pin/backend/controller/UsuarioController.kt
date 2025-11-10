package org.pin.backend.controller
import org.pin.backend.service.UsuarioService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/usuarios")
class UsuarioController(
    private val service: UsuarioService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
