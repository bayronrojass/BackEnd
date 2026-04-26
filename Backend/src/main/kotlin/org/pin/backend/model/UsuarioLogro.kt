package org.pin.backend.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class UsuarioLogro(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    var usuario: Usuario,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "logro_id", nullable = false)
    var logro: Logro,

    @Column(nullable = false)
    var progreso: Int = 0,

    @Column(nullable = true)
    var fechaCompletado: LocalDateTime? = null
)
