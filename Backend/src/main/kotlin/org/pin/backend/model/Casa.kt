package org.pin.backend.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.time.LocalDateTime

@Entity
class Casa(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(length = 50, nullable = false)
    @field:Size(min = 1, max = 50, message = "Name length must be between 1 and 255")
    @field:NotBlank(message = "Name cannot be blank")
    var nombre: String,
    @Column(length = 255, nullable = true)
    @field:Size(min = 0, max = 255, message = "Description length must be between 0 and 255")
    var descripcion: String? = null,
    @Column(nullable = true)
    var rutaImagen: String? = null,
    @Column(nullable = false)
    @field:NotNull(message = "Date cannot be empty")
    val fechaCreacion: LocalDateTime,
    @OneToMany(orphanRemoval = true, cascade = [CascadeType.ALL])
    var gastos: MutableSet<Gasto> = mutableSetOf(),
    @OneToMany(mappedBy = "casa", cascade = [CascadeType.ALL], orphanRemoval = true)
    var multimedia: MutableSet<Multimedia> = mutableSetOf(),
    @OneToMany(orphanRemoval = true, cascade = [CascadeType.ALL])
    var listas: MutableSet<Lista> = mutableSetOf(),
    @OneToMany(orphanRemoval = true, cascade = [CascadeType.ALL])
    var eventos: MutableSet<Evento> = mutableSetOf(),
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "casa_usuarios",
        joinColumns = [JoinColumn(name = "casa_id")],
        inverseJoinColumns = [JoinColumn(name = "usuarios_id")],
    )
    var miembros: MutableSet<Usuario> = mutableSetOf(),
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "casa_administradores",
        joinColumns = [JoinColumn(name = "casa_id")],
        inverseJoinColumns = [JoinColumn(name = "admin_id")],
    )
    var administradores: MutableSet<Usuario> = mutableSetOf(),
    @OneToMany(
        mappedBy = "casa",
        cascade = [CascadeType.ALL],
        orphanRemoval = true,
        fetch = FetchType.LAZY,
    )
    var tareas: MutableSet<Tarea> = mutableSetOf(),
    @OneToMany(mappedBy = "casa", cascade = [CascadeType.ALL], orphanRemoval = true)
    var encuestas: MutableSet<Encuesta> = mutableSetOf(),
)
