package org.pin.backend.model
import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.OneToOne

@Entity
class PostIt(
    @OneToOne(orphanRemoval = true, cascade = [CascadeType.ALL])
    var lienzo: Lienzo? = null,
    var localizacion: String = "",
) : Multimedia()
