package org.pin.backend.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Invitacion(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "remitente_id")
    val remitente: Usuario,

    @ManyToOne
    @JoinColumn(name = "destinatario_id")
    val destinatario: Usuario,

    @ManyToOne
    @JoinColumn(name = "casa_id")
    val casa: Casa,

    @Enumerated(EnumType.STRING)
    var estado: EstadoInvitacion = EstadoInvitacion.PENDIENTE,

    val fechaCreacion: LocalDateTime = LocalDateTime.now()
)