import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/resumens")
class ResumenController(private val service: ResumenService) {
    @GetMapping
    fun getAll() = service.findAll()
}