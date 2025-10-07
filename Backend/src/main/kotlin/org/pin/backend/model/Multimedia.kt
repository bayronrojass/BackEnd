package org.pin.backend.model
import jakarta.persistence.*
import jakarta.validation.constraints.PositiveOrZero

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
class Multimedia(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(nullable = false)
    @field:PositiveOrZero
    var posicionX: Int = 0,
    @Column(nullable = false)
    @field:PositiveOrZero
    var posicionY: Int = 0,
    @Column(nullable = true)
    var ruta: String? = null,
    @ManyToOne()
    val usuario: Usuario? = null,
)
