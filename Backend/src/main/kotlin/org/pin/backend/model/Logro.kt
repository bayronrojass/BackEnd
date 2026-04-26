package org.pin.backend.model

import jakarta.persistence.*
import org.pin.backend.model.enums.CategoriaLogro
import org.pin.backend.model.enums.NivelLogro

@Entity
class Logro(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false, unique = true)
    var codigo: String,

    @Column(nullable = false)
    var nombre: String,

    @Column(nullable = false)
    var descripcion: String,

    @Enumerated(EnumType.STRING)
    var categoria: CategoriaLogro,

    @Enumerated(EnumType.STRING)
    var nivel: NivelLogro,

    @Column(nullable = false)
    var meta: Int
)
