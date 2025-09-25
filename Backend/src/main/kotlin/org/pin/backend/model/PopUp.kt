import jakarta.persistence.*

@Entity
data class PopUp(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nombre: String
)