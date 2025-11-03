package org.pin.backend.repository
import org.pin.backend.model.Casa
import org.pin.backend.model.Lista
import org.pin.backend.model.Tarea
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional


interface CasaRepository : JpaRepository<Casa, Long>{
    fun findByListasContains(lista: Lista): Optional<Casa>

    fun findByTareasContains(tarea: Tarea): Optional<Casa>
}