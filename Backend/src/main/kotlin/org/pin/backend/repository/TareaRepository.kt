package org.pin.backend.repository
import org.pin.backend.model.Tarea
import org.pin.backend.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface TareaRepository : JpaRepository<Tarea, Long> {
    fun findByAsignadoA(usuario: Usuario): List<Tarea>

}
