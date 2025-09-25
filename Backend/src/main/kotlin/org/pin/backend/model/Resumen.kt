import jakarta.persistence.*

@Entity
data class Resumen(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nombre: String,
)
