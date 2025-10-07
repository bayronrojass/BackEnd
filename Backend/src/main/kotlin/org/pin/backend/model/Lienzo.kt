package org.pin.backend.model
import jakarta.persistence.*
import jakarta.validation.constraints.Size

@Entity
class Lienzo(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    var bytes: String,

    @Column(nullable = false)
    @field:Size(min = 1)
    var pixelsX: Short,

    @Column(nullable = false)
    @field:Size(min = 1)
    var pixelsY: Short,
)
