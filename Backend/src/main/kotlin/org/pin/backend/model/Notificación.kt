import jakarta.persistence.*

@Entity
data class Notificación(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nombre: String,
)
