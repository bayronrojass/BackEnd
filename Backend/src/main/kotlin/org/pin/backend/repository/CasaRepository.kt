package org.pin.backend.repository

import org.pin.backend.model.Casa
import org.pin.backend.model.Evento
import org.pin.backend.model.Lista
import org.pin.backend.model.Tarea
import org.pin.backend.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface CasaRepository : JpaRepository<Casa, Long> {
    fun findByListasContains(lista: Lista): Optional<Casa>

    fun findByTareasContains(tarea: Tarea): Optional<Casa>

    fun findByAdministradoresContains(usuario: Usuario): List<Casa>

    fun findByMiembrosContains(usuario: Usuario): List<Casa>

    fun findByEventosContains(evento: Evento): Optional<Casa>

    @Query(
        "SELECT DISTINCT c FROM Casa c " +
            "LEFT JOIN FETCH c.gastos g " +
            "LEFT JOIN FETCH g.pagadoPor " +
            "LEFT JOIN FETCH g.beneficiarios " +
            "WHERE c.id = :id",
    )
    fun findByIdWithGastos(id: Long): Casa?

    @Query("SELECT c FROM Casa c LEFT JOIN FETCH c.tareas t LEFT JOIN FETCH t.asignadoA WHERE c.id = :id")
    fun findByIdWithTareas(id: Long): Casa?

    @Query("SELECT c FROM Casa c LEFT JOIN FETCH c.miembros WHERE c.id = :id")
    fun findByIdWithMiembros(id: Long): Casa?

    @Query(
        "SELECT DISTINCT c FROM Casa c " +
            "LEFT JOIN FETCH c.listas l " +
            "LEFT JOIN FETCH l.propietario " +
            "LEFT JOIN FETCH l.participantes " +
            "WHERE c.id = :id",
    )
    fun findByIdWithListas(id: Long): Casa?

    @Query(
        "SELECT DISTINCT c FROM Casa c " +
            "LEFT JOIN FETCH c.eventos e " +
            "LEFT JOIN FETCH e.creadoPor " +
            "LEFT JOIN FETCH e.asistentes " +
            "WHERE c.id = :id",
    )
    fun findByIdWithEventos(id: Long): Casa?
}
