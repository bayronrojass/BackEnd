import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/votos")
class VotoController(private val service: VotoService) {
    @GetMapping
    fun getAll() = service.findAll()
}
