package org.pin.backend.repository

import org.pin.backend.model.PreferenciaTarea
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PreferenciaTareaRepository : JpaRepository<PreferenciaTarea, Long> {
    fun findByTareaIdAndUsuarioId(tareaId: Long, usuarioId: Long): PreferenciaTarea?
    fun findByTareaCasaId(casaId: Long): List<PreferenciaTarea>
}
