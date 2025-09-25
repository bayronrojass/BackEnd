import jakarta.persistence.*

@Entity
data class Imagen(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nombre: String
)