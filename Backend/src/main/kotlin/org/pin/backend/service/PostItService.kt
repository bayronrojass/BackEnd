import org.springframework.stereotype.Service

@Service
class PostItService(
    private val repo: PostItRepository,
) {
    fun findAll() = repo.findAll()
}
