import jakarta.persistence.*
import jakarta.validation.constraints.*
import java.time.LocalDateTime

@Entity
class Casa(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(length = 50, nullable = false)
    @field:Size(min = 1, max = 50, message = "Name length must be between 1 and 255" )
    @field:NotBlank(message = "Name cannot be blank")
    var nombre: String,

    @Column(length = 255, nullable = true)
    @field:Size(min = 0, max = 255, message = "Description length must be between 0 and 255" )
    var descripcion: String? = null,

    @Column(nullable = true)
    var rutaImagen: String? = null,

    @Column(nullable = false)
    @field:PastOrPresent("Creation date cannot be in the future")
    @field:NotNull(message = "Date cannot be empty")
    val fechaCreacion : LocalDateTime,

    @OneToMany
    var notifaciones: MutableList<Notificacion> = mutableListOf(),

    @OneToMany
    var gastos: MutableList<Gasto> = mutableListOf(),

    @OneToMany
    var multimedia: MutableList<Multimedia> = mutableListOf(),

    @OneToMany
    var lienzos: MutableList<Lienzo> = mutableListOf(),

    @OneToMany
    var listas: MutableList<Lista> = mutableListOf(),

    @OneToMany
    var eventos: MutableList<Evento> = mutableListOf(),

    @OneToMany
    var usuarios: MutableList<Usuario> = mutableListOf(),

    @OneToMany
    var administradores: MutableList<Usuario> = mutableListOf(),
)
