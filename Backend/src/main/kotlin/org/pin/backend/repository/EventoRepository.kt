package org.pin.backend.repository
import org.pin.backend.model.Evento
import org.pin.backend.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface EventoRepository : JpaRepository<Evento, Long>{

fun findByCreadoPor(usuario: Usuario): List<Evento>

fun findByAsistentesContains(usuario: Usuario): List<Evento>
}