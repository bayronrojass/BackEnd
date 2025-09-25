import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/imagens")
class ImagenController(private val service: ImagenService) {
    @GetMapping
    fun getAll() = service.findAll()
}
