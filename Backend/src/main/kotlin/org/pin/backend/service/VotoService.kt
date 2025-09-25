import org.springframework.stereotype.Service

@Service
class VotoService(
    private val repo: VotoRepository,
) {
    fun findAll() = repo.findAll()
}
