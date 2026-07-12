package org.pin.backend.model
import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
class Elemento(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(length = 50, nullable = false)
    @field:Size(min = 1, max = 50, message = "Name length must be between 1 and 50")
    @field:NotBlank(message = "Name cannot be blank")
    var nombre: String = "",
    @Column(length = 255, nullable = true)
    @field:Size(min = 0, max = 255, message = "Description length must be between 0 and 255")
    var descripcion: String? = null,
    var completado: Boolean = false,
    var cantidad: Int = 1,
    @Column(name = "icono_key", nullable = true)
    var iconoKey: String? = null,
    @ManyToOne
    @JoinColumn(name = "lista_id")
    @JsonIgnore
    var lista: Lista? = null,
)
