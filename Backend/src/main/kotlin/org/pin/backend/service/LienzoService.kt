import org.springframework.stereotype.Service

@Service
class LienzoService(private val repo: LienzoRepository) {
    fun findAll() = repo.findAll()
}
