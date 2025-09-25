import org.springframework.stereotype.Service

@Service
class ItemService(private val repo: ItemRepository) {
    fun findAll() = repo.findAll()
}