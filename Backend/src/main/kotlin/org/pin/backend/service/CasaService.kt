import org.springframework.stereotype.Service

@Service
class CasaService(private val repo: CasaRepository) {
    fun findAll() = repo.findAll()
}
