import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/items")
class ItemController(private val service: ItemService) {
    @GetMapping
    fun getAll() = service.findAll()
}
