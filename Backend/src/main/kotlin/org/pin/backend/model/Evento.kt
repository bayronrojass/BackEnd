package org.pin.backend.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.time.LocalDateTime
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@Entity
class Evento(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(length = 50, nullable = false)
    @field:Size(min = 1, max = 50, message = "Name length must be between 1 and 255")
    @field:NotBlank(message = "Name cannot be blank")
    var nombre: String,

    @Column(length = 255, nullable = true)
    @field:Size(min = 0, max = 255, message = "Description length must be between 0 and 255")
    var descripcion: String? = null,

    @Column(nullable = false)
    var fechaCreacion: LocalDateTime,

    @Column(nullable = false)
    @field:NotNull(message = "Start date cant be null")
    var fechaInicio: LocalDateTime,

    @Column(nullable = true)
    var fechaFin: LocalDateTime? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("hibernateLazyInitializer", "handler")
    val creadoPor: Usuario,

    @ManyToMany
    @JoinTable(
        name = "evento_asistentes",
        joinColumns = [JoinColumn(name = "evento_id")],
        inverseJoinColumns = [JoinColumn(name = "usuario_id")]
    )
    @JsonIgnoreProperties("hibernateLazyInitializer", "handler")
    var asistentes: MutableList<Usuario> = mutableListOf()
)

