import jakarta.persistence.*

@Entity
data class Lienzo(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nombre: String,
)
