package org.pin.backend.model
import jakarta.persistence.*

@Entity
class PostIt(
    @OneToOne
    var lienzo : Lienzo? = null,
) : Multimedia()
