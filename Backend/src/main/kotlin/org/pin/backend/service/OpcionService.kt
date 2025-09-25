import org.springframework.stereotype.Service

@Service
class OpcionService(private val repo: OpcionRepository) {
    fun findAll() = repo.findAll()
}
