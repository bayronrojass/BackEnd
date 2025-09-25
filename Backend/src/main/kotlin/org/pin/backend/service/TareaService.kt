import org.springframework.stereotype.Service

@Service
class TareaService(
    private val repo: TareaRepository,
) {
    fun findAll() = repo.findAll()
}
