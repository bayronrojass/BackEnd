package org.pin.backend.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.validation.constraints.Size
import org.hibernate.annotations.UpdateTimestamp
import java.time.Instant

@Entity
class FirebaseToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @Column(length = 255, nullable = false)
    @field:Size(min = 0, max = 255, message = "Token length must be between 0 and 255")
    lateinit var token: String

    @ManyToOne
    lateinit var usuario: Usuario

    @UpdateTimestamp
    @Column(name = "last_edited", columnDefinition = "TIMESTAMP", nullable = false)
    lateinit var lastEdited: Instant
}
