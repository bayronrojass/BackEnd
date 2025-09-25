import jakarta.persistence.*

@Entity
data class Tarea(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nombre: String
)