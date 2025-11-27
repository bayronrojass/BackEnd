package org.pin.backend.service

import org.pin.backend.dto.Request.EventoRequestDTO
import org.pin.backend.model.Evento
import org.pin.backend.model.Usuario
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.EventoRepository
import org.pin.backend.repository.UsuarioRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class EventoService(
    private val repo: EventoRepository,
    private val usuarioRepo: UsuarioRepository,
    private val casaRepo: CasaRepository,
) {
    fun findAll() = repo.findAll()

    fun crearEvento(
        casaId: Long,
        request: EventoRequestDTO,
    ): Evento {
        val casa =
            casaRepo
                .findById(casaId)
                .orElseThrow { IllegalArgumentException("Casa no encontrada con ID: $casaId") }

        val creadoPor =
            usuarioRepo
                .findById(request.creadoPor)
                .orElseThrow { IllegalArgumentException("Usuario no encontrado con ID: ${request.creadoPor}") }

        val asistentes =
            mutableListOf<Usuario>().apply {
                add(creadoPor)
            }

        val nuevoEvento =
            Evento(
                nombre = request.nombre,
                descripcion = request.descripcion,
                fechaCreacion = LocalDateTime.now(),
                fechaInicio = request.fechaInicio,
                fechaFin = request.fechaFin,
                creadoPor = creadoPor,
                asistentes = asistentes,
            )

        val eventoGuardado = repo.save(nuevoEvento)

        casa.eventos.add(eventoGuardado)
        casaRepo.save(casa)

        return eventoGuardado
    }
}
