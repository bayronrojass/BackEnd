package org.pin.backend.model

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

    @Column(nullable = false)
    var contrasena: String = "",

    // Esta relación ahora apunta a 'miembros' en Casa.kt (Correcto)
    @ManyToMany(mappedBy = "miembros", fetch = FetchType.LAZY)
    var casas: MutableSet<Casa> = mutableSetOf(),

    @ManyToMany(mappedBy = "administradores", fetch = FetchType.LAZY)
    var casasAdministradas: MutableSet<Casa> = mutableSetOf()
)