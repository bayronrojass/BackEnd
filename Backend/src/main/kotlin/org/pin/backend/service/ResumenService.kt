import org.springframework.stereotype.Service

@Service
class ResumenService(
    private val repo: ResumenRepository,
) {
    fun findAll() = repo.findAll()
}
