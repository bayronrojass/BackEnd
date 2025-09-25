import jakarta.persistence.*

@Entity
data class Multimedia(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nombre: String,
)
