package org.pin.backend.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import org.pin.backend.model.enums.CategoriaGasto
import java.time.LocalDateTime

@Entity
class Gasto(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(length = 50, nullable = false)
    @field:Size(min = 1, max = 50, message = "Name length must be between 1 and 255")
    @field:NotBlank(message = "Name cannot be blank")
    var nombre: String,
    @Column(length = 255, nullable = true)
    @field:Size(min = 0, max = 255, message = "Description length must be between 0 and 255")
    var descripcion: String? = null,
    @Column(nullable = false)
    var importe: Double = 0.0,
    @Column(nullable = false)
    @field:NotNull(message = "Start date cant be null")
    var fechaInicio: LocalDateTime,
    @Enumerated(EnumType.STRING)
    var categoria: CategoriaGasto = CategoriaGasto.OTROS,
    @Column(length = 500, nullable = true)
    var fotoTicketUrl: String? = null,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pagado_por_id")
    var pagadoPor: Usuario? = null,
    @OneToMany(orphanRemoval = true, cascade = [CascadeType.ALL])
    var pagos: MutableList<Pago> = mutableListOf(),
    @ElementCollection
    @CollectionTable(name = "gasto_beneficiarios")
    var beneficiarios: MutableList<String> = mutableListOf()
)
