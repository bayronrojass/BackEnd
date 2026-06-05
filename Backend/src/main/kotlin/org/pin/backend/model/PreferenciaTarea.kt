package org.pin.backend.model
import jakarta.persistence.*

@Entity
data class PreferenciaTarea(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    val tarea: Tarea? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    val usuario: Usuario? = null,

    // 1 Me gusta, -1 No me gusta, 0 Me da igual
    var puntuacion: Int = 0
)
