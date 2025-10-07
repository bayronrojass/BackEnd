package org.pin.backend.model
import jakarta.persistence.*

@Entity
class Voto(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @OneToOne
    val votante : Usuario,
)
