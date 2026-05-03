package org.pin.backend.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*

@Entity
@Table(name = "encuesta_votos")
class Voto(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "votante_id")
    var votante: Usuario,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "opcion_id")
    @JsonIgnore
    var opcion: Opcion? = null
)
