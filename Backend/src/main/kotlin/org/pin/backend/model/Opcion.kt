package org.pin.backend.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank

@Entity
@Table(name = "encuesta_opciones")
class Opcion(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(nullable = false)
    @field:NotBlank(message = "El texto de la opción no puede estar vacío")
    var texto: String,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "encuesta_id")
    @JsonIgnore
    var encuesta: Encuesta? = null,
    @OneToMany(mappedBy = "opcion", cascade = [CascadeType.ALL], orphanRemoval = true)
    var votos: MutableSet<Voto> = mutableSetOf(),
)
