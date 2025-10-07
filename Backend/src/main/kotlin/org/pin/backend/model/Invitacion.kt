package org.pin.backend.model

import jakarta.persistence.*

@Entity
class Invitacion(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @OneToOne
    val anfitrion: Usuario,
    @OneToOne
    val miembro: Usuario,
    @OneToOne
    val casa: Casa,
)
