import jakarta.persistence.*

@Entity
class PostIt(
    @OneToOne
    var lienzo : Lienzo? = null,
) : Multimedia()
