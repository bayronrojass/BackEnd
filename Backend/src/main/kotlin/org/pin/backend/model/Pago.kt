package org.pin.backend.model
import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.PastOrPresent
import jakarta.validation.constraints.Positive
import java.math.BigDecimal
import java.time.LocalDateTime

@Entity
class Pago(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(precision = 10, scale = 2, nullable = false)
    @field:Positive
    val cantidad: BigDecimal,
    @Column(nullable = false)
    @field:NotNull(message = "Start date cannot be null")
    @field:PastOrPresent(message = "Date cannot be future")
    val fecha: LocalDateTime,
    @field:NotNull(message = "User cannot be null")
    @OneToOne
    val pagadoPor: Usuario,
)
