import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/postits")
class PostItController(
    private val service: PostItService,
) {
    @GetMapping
    fun getAll() = service.findAll()
}
