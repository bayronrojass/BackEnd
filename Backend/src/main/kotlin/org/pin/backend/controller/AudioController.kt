import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/audios")
class AudioController(private val service: AudioService) {
    @GetMapping
    fun getAll() = service.findAll()
}