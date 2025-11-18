package org.pin.backend.repository
import org.pin.backend.model.Casa
import org.pin.backend.model.Evento
import org.pin.backend.model.Lista
import org.pin.backend.model.Tarea
import org.pin.backend.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CasaRepository : JpaRepository<Casa, Long> {
    fun findByListasContains(lista: Lista): Optional<Casa>

    fun findByTareasContains(tarea: Tarea): Optional<Casa>

    fun findByAdministradoresContains(usuario: Usuario): List<Casa>

    fun findByMiembrosContains(usuario: Usuario): List<Casa>

    fun findByEventosContains(evento: Evento): Optional<Casa>
}
