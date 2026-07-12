package org.pin.backend.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import java.time.LocalDateTime

@Entity
@Table(name = "encuestas")
class Encuesta(
    @Column(length = 50, nullable = false)
    @field:Size(min = 1, max = 50, message = "Titulo length must be between 1 and 255")
    @field:NotBlank(message = "Titulo cannot be blank")
    var titulo: String,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creador_id")
    var creador: Usuario,
    @Enumerated(EnumType.STRING)
    var estado: EstadoEncuesta = EstadoEncuesta.ABIERTA,
    var fechaCreacion: LocalDateTime = LocalDateTime.now(),
    @Column(name = "color_hex", nullable = false)
    var colorHex: String = "#2196F3",
    @OneToMany(mappedBy = "encuesta", cascade = [CascadeType.ALL], orphanRemoval = true)
    var opciones: MutableList<Opcion> = mutableListOf(),
) : Multimedia()

enum class EstadoEncuesta {
    ABIERTA,
    CERRADA,
}
