package org.pin.backend.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

@Entity
class Usuario(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(length = 255, nullable = false)
    @field:Size(min = 1, max = 255, message = "Name length must be between 1 and 255")
    @field:NotBlank(message = "Name cannot be blank")
    var nombre: String,
    @Column(length = 255, nullable = false)
    @field:Email(message = "Email must be correct")
    @field:Size(min = 0, max = 255, message = "Email length must be between 0 and 255")
    var correo: String,
    @JsonIgnore
    @Column(nullable = false)
    var contrasena: String = "",
    @Column(name = "foto_url")
    var fotoUrl: String? = null,
    @Column(nullable = false)
    var puntosConvivencia: Int = 0,
    @ManyToMany(mappedBy = "miembros", fetch = FetchType.LAZY)
    var casas: MutableSet<Casa> = mutableSetOf(),
    @ManyToMany(mappedBy = "administradores", fetch = FetchType.LAZY)
    var casasAdministradas: MutableSet<Casa> = mutableSetOf(),
    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    var tokens: MutableSet<FirebaseToken> = mutableSetOf(),
    @OneToMany(mappedBy = "usuario", cascade = [CascadeType.ALL], orphanRemoval = true)
    var logrosProgreso: MutableList<UsuarioLogro> = mutableListOf(),
)
