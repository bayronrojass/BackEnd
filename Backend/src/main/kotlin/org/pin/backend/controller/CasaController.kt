package org.pin.backend.controller
import org.pin.backend.model.Casa
import org.pin.backend.repository.CasaRepository
import org.pin.backend.service.CasaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/casas")
class CasaController(
    private val service: CasaService,
) {
    @GetMapping
    fun getAll() = service.findAll()

    @PostMapping
    fun crearPiso(@RequestBody casa: Casa): Casa {
        return service.save(casa)
    }

    @GetMapping
    fun listarPisos(): MutableList<Casa?> {
        return service.findAll()
    }
}
