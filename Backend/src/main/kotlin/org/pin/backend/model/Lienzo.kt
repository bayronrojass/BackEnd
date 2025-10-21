package org.pin.backend.model
import jakarta.persistence.*
import jakarta.validation.constraints.Min

@Entity
class Lienzo(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Lob
    @Column(nullable = false, columnDefinition = "BYTEA")
    var bytes: ByteArray,
    @Column(nullable = false)
    @field:Min(1)
    var pixelsX: Short,
    @Column(nullable = false)
    @field:Min(1)
    var pixelsY: Short,
)
