import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/pisos")
@CrossOrigin(origins = "*") // permite peticiones desde Android
class PisoController {
    @Autowired
    private val pisoRepository: PisoRepository? = null

    @PostMapping
    fun crearPiso(@RequestBody piso: Piso?): Piso {
        return pisoRepository.save(piso)
    }

    @GetMapping
    fun listarPisos(): MutableList<Piso?> {
        return pisoRepository.findAll()
    }
}