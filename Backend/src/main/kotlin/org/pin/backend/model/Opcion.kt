package org.pin.backend.model
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

@Entity
class Opcion(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(length = 50, nullable = false)
    @field:Size(min = 1, max = 50, message = "Name length must be between 1 and 255")
    @field:NotBlank(message = "Name cannot be blank")
    var nombre: String,
    @OneToMany
    var votos: MutableSet<Voto> = mutableSetOf(),
)
