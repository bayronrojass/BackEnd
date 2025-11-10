package org.pin.backend.model
import jakarta.persistence.*
import jakarta.validation.constraints.PositiveOrZero

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
class Multimedia(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(nullable = false)
    @field:PositiveOrZero
    var posicionX: Float = 0f,
    @Column(nullable = false)
    @field:PositiveOrZero
    var posicionY: Float = 0f,
    @Column(nullable = true)
    var ruta: String? = null,
    @ManyToOne()
    val usuario: Usuario? = null,
    @ManyToOne
    @JoinColumn(name = "casa_id")
    var casa : Casa? = null,
)
