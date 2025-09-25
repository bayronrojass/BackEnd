import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/lienzos")
class LienzoController(private val service: LienzoService) {
    @GetMapping
    fun getAll() = service.findAll()
}