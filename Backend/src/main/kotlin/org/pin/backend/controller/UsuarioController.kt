import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/usuarios")
class UsuarioController(private val service: UsuarioService) {
    @GetMapping
    fun getAll() = service.findAll()
}