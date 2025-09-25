import jakarta.persistence.*

@Entity
data class Voto(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nombre: String
)
