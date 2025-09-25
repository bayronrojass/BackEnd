import org.springframework.stereotype.Service

@Service
class ImagenService(
    private val repo: ImagenRepository,
) {
    fun findAll() = repo.findAll()
}
