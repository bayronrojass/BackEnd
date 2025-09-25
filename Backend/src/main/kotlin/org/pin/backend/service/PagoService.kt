import org.springframework.stereotype.Service

@Service
class PagoService(private val repo: PagoRepository) {
    fun findAll() = repo.findAll()
}