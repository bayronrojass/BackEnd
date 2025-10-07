package org.pin.backend.model
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

@Entity
class Encuesta(
    @Column(length = 50, nullable = false)
    @field:Size(min = 1, max = 50, message = "Titulo length must be between 1 and 255" )
    @field:NotBlank(message = "Titulo cannot be blank")
    var titulo: String,

    @OneToMany
    var opciones: MutableList<Opcion> = mutableListOf(),
) : Multimedia()
