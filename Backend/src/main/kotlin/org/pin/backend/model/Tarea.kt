package org.pin.backend.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime

@Entity
class Tarea(
    nombre: String,
    descripcion: String? = null,
    completado: Boolean = false,

    @Column(nullable = true)
    var fechaFin: LocalDateTime? = null,

    @Column(nullable = true)
    var frecuencia: String? = null,

    @Column(nullable = false)
    var periodica: Boolean = false,

    @ManyToOne(fetch = FetchType.LAZY)
    var asignadoA: Usuario? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "casa_id")
    var casa: Casa

) : Elemento()
