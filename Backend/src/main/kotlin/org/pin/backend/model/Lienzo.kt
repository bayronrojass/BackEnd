package org.pin.backend.model
import jakarta.persistence.*
import jakarta.validation.constraints.Min

@Entity
class Lienzo(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(nullable = false, columnDefinition = "BYTEA")
    var bytes: ByteArray,
    @Column(nullable = false)
    @field:Min(1)
    var width: Short,
    @Column(nullable = false)
    @field:Min(1)
    var height: Short,
) {
    @PostLoad
    fun initBytes() {
        if (bytes.isEmpty()) {
            bytes = ByteArray(width * height)
            bytes.fill("11".hexToByte(), 0, width * height)
        }
    }
}
