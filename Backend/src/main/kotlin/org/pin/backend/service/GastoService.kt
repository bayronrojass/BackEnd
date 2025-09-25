import org.springframework.stereotype.Service

@Service
class GastoService(private val repo: GastoRepository) {
    fun findAll() = repo.findAll()
}