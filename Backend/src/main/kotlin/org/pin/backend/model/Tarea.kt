package org.pin.backend.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import java.time.LocalDateTime

@Entity
class Tarea(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(length = 50, nullable = false)
    @field:Size(min = 1, max = 50, message = "Name length must be between 1 and 50")
    @field:NotBlank(message = "Name cannot be blank")
    var nombre: String,
    @Column(length = 255, nullable = true)
    @field:Size(min = 0, max = 255, message = "Description length must be between 0 and 255")
    var descripcion: String? = null,
    var completado: Boolean = false,
    @Column(nullable = true)
    var fechaFin: LocalDateTime? = null,
    @Column(nullable = true)
    var frecuencia: String? = null,
    @Column(length = 20, nullable = true)
    var prioridad: String? = "Media",
    @Column(nullable = false)
    var periodica: Boolean = false,
    @ManyToOne(fetch = FetchType.LAZY)
    var asignadoA: Usuario? = null,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "casa_id")
    var casa: Casa? = null,
)
