import org.springframework.stereotype.Service

@Service
class MultimediaService(
    private val repo: MultimediaRepository,
) {
    fun findAll() = repo.findAll()
}
