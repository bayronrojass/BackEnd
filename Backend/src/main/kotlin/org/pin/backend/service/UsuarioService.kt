import org.springframework.stereotype.Service

@Service
class UsuarioService(
    private val repo: UsuarioRepository,
) {
    fun findAll() = repo.findAll()
}
