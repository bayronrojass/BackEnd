import org.springframework.stereotype.Service

@Service
class EventoService(private val repo: EventoRepository) {
    fun findAll() = repo.findAll()
}
