package org.pin.backend.model

import jakarta.persistence.*
import org.pin.backend.model.enums.EstadoInvitacion
import java.time.LocalDateTime

@Entity
class Invitacion(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "remitente_id", nullable = false)
    val remitente: Usuario,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "destinatario_id", nullable = false)
    val destinatario: Usuario,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "casa_id", nullable = false)
    val casa: Casa,
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    var estado: EstadoInvitacion = EstadoInvitacion.PENDIENTE,
    @Column(nullable = false)
    val fechaCreacion: LocalDateTime = LocalDateTime.now(),
)
