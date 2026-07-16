package org.pin.backend.model
import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.OneToOne

@Entity
class PostIt(
    @OneToOne(orphanRemoval = true, cascade = [CascadeType.ALL])
    var lienzo: Lienzo? = null,
    var tipo: String = "DIBUJO",
    var rutaAudio: String? = null,
    /**
     * Background color of the note itself, stored as a hex string (e.g. `#FFF9C4`).
     * Nullable — legacy post-its default to the classic yellow on the client. Set from
     * the new "Color de la nota" pastel selector in the expanded drawing view.
     */
    var colorNota: String? = null,
) : Multimedia()
