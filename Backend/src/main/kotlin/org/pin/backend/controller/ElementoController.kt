import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/elementos")
class ElementoController(
    private val service: ElementoService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
