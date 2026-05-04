package org.pin.backend.model

import com.fasterxml.jackson.annotation.JsonIgnore // IMPORTANTE
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.PositiveOrZero

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
class Multimedia(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    @field:PositiveOrZero
    var posicionX: Float = 0f,

    @Column(nullable = false)
    @field:PositiveOrZero
    var posicionY: Float = 0f,

    @Column(nullable = false)
    @field:PositiveOrZero
    var width: Int = 0,

    @Column(nullable = false)
    @field:PositiveOrZero
    var height: Int = 0,

    @Column(nullable = true)
    var ruta: String? = null,

    @Column(nullable = false)
    @field:NotBlank(message = "Location cannot be blank")
    var localizacion: String = "",

    @ManyToOne
    @JsonIgnore
    val usuario: Usuario? = null,

    @ManyToOne
    @JoinColumn(name = "casa_id")
    @JsonIgnore
    var casa: Casa? = null,
)
