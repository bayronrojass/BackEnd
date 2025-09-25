import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/eventos")
class EventoController(private val service: EventoService) {
    @GetMapping
    fun getAll() = service.findAll()
}
