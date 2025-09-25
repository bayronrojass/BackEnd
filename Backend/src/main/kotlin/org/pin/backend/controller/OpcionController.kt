import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/opcions")
class OpcionController(private val service: OpcionService) {
    @GetMapping
    fun getAll() = service.findAll()
}
