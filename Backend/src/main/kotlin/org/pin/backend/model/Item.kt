import jakarta.persistence.*

@Entity
data class Item(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nombre: String
)
