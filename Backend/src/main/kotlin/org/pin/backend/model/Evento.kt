import jakarta.persistence.*

@Entity
data class Evento(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nombre: String,
)
