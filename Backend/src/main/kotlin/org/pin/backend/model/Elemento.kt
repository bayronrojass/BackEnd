import jakarta.persistence.*

@Entity
data class Elemento(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nombre: String,
)
