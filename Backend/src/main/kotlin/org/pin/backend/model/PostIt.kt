package org.pin.backend.model
import jakarta.persistence.*

@Entity
class PostIt(
    @OneToOne(orphanRemoval = true, cascade = [CascadeType.ALL])
    var lienzo: Lienzo? = null,

    var plegado: Boolean? = false
) : Multimedia()
