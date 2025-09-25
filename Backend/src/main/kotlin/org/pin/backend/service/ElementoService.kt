import org.springframework.stereotype.Service

@Service
class ElementoService(private val repo: ElementoRepository) {
    fun findAll() = repo.findAll()
}