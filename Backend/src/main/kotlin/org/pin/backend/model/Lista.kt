package org.pin.backend.model
import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import java.time.LocalDateTime

@Entity
class Lista(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(length = 50, nullable = false)
    @field:Size(min = 1, max = 50, message = "Name length must be between 1 and 255")
    @field:NotBlank(message = "Name cannot be blank")
    var nombre: String,
    @Column(length = 255, nullable = true)
    @field:Size(min = 0, max = 255, message = "Description length must be between 0 and 255")
    var descripcion: String? = null,
    var fechaCreacion: LocalDateTime = LocalDateTime.now(),
    var fechaEdicion: LocalDateTime? = null,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "propietario_id")
    var propietario: Usuario? = null,
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "lista_participantes",
        joinColumns = [JoinColumn(name = "lista_id")],
        inverseJoinColumns = [JoinColumn(name = "usuario_id")],
    )
    var participantes: MutableList<Usuario> = mutableListOf(),
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "casa_id")
    var casa: Casa? = null,
    @Column(nullable = false)
    @OneToMany(orphanRemoval = true, cascade = [CascadeType.ALL])
    var elementos: MutableList<Elemento> = mutableListOf(),
)
