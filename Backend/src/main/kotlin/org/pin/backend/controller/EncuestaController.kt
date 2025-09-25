import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/encuestas")
class EncuestaController(
    private val service: EncuestaService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
