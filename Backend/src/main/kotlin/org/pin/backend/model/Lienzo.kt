package org.pin.backend.model
import jakarta.persistence.*
import jakarta.validation.constraints.Min
import org.hibernate.annotations.UpdateTimestamp
import org.pin.backend.utils.LZ4Compression
import java.time.Instant
import java.time.LocalDateTime
import kotlin.time.ExperimentalTime

@Entity
class Lienzo
    @OptIn(ExperimentalTime::class)
    constructor(
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
        @UpdateTimestamp
        @Column(name = "last_edited", columnDefinition = "TIMESTAMP", nullable = false)
        var lastEdited: Instant,
    ) {
        fun getBytesDescomprimidos(): ByteArray = LZ4Compression.decompress(bytes)

        fun comprimirBytes() {bytes = LZ4Compression.compress(bytes)}
    }
