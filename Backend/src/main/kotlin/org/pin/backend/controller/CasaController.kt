package org.pin.backend.controller
import org.pin.backend.model.Casa
import org.pin.backend.service.CasaService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/casas")
class CasaController(
    private val service: CasaService,
) {
    @GetMapping
    fun getAll() = service.findAll()

    @PostMapping
    fun crearCasa(
        @RequestBody casa: Casa,
    ): Casa = service.save(casa)
}
