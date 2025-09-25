import org.springframework.stereotype.Service

@Service
class PushService(
    private val repo: PushRepository,
) {
    fun findAll() = repo.findAll()
}
