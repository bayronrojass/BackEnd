package org.pin.backend.model
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
class Notificacion(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(length = 50, nullable = false)
    @field:Size(min = 1, max = 50, message = "Title length must be between 1 and 255")
    @field:NotBlank(message = "Title cannot be blank")
    var titulo: String = "",
    @Column(length = 1024, nullable = false)
    @field:Size(min = 0, max = 1024, message = "Body length must be between 0 and 255")
    var cuerpo: String = "",
    @ManyToMany(fetch = FetchType.LAZY)
    var receptor: MutableList<Usuario> = mutableListOf(),
)
