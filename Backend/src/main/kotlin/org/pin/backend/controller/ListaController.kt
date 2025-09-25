import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/listas")
class ListaController(private val service: ListaService) {
    @GetMapping
    fun getAll() = service.findAll()
}