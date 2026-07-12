package org.pin.backend.model

import jakarta.persistence.*

@Entity
@Table(name = "catalogo_productos")
class CatalogoProducto(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(nullable = false, unique = true)
    var nombre: String,
    @Column(nullable = false)
    var categoria: String,
    @Column(name = "icono_key", nullable = false)
    var iconoKey: String,
)
