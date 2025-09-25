import org.springframework.stereotype.Service

@Service
class PopUpService(private val repo: PopUpRepository) {
    fun findAll() = repo.findAll()
}
