package org.pin.backend.repository
import org.pin.backend.model.Tarea
import org.springframework.data.jpa.repository.JpaRepository

interface TareaRepository : JpaRepository<Tarea, Long>
