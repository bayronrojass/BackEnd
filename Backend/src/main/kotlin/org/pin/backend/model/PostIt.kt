package org.pin.backend.model
import jakarta.persistence.*

@Entity
class PostIt(
    @OneToOne(orphanRemoval = true, cascade = [CascadeType.ALL])
    var lienzo: Lienzo? = null,
) : Multimedia()
