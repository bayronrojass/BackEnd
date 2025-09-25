import jakarta.persistence.*

@Entity
data class PostIt(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nombre: String,
)
