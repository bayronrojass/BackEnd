import org.springframework.stereotype.Service

@Service
class AudioService(private val repo: AudioRepository) {
    fun findAll() = repo.findAll()
}