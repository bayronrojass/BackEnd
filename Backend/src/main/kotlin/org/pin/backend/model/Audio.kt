import jakarta.persistence.*

@Entity
data class Audio(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nombre: String
)
