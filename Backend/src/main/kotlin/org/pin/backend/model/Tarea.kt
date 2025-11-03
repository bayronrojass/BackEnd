package org.pin.backend.model
import jakarta.persistence.Column
import jakarta.persistence.Entity
import org.jetbrains.annotations.NotNull
import java.time.LocalDateTime

@Entity
class Tarea(
    @Column(nullable = false)
    @field:NotNull
    val periodica: Boolean,
    @Column(nullable = true)
    val frecuencia: LocalDateTime? = null,
    @Column(nullable = true)
    val fechaFin: LocalDateTime? = null,
) : Elemento()
