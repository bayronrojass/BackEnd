import jakarta.persistence.*

@Entity
data class Gasto(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nombre: String
)
