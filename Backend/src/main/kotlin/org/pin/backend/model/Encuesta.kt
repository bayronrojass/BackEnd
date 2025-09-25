import jakarta.persistence.*

@Entity
data class Encuesta(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nombre: String
)
