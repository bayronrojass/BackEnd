package org.pin.backend.service

import org.pin.backend.dto.Request.EventoRequestDTO
import org.pin.backend.dto.Response.EventoResponseDTO
import org.pin.backend.model.Evento
import org.pin.backend.model.Usuario
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.EventoRepository
import org.pin.backend.repository.UsuarioRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime

@Service
@Transactional
class EventoService(
    private val repo: EventoRepository,
    private val usuarioRepo: UsuarioRepository,
    private val casaRepo: CasaRepository,
    private val firebaseMessagingService: FirebaseMessagingService,
) {
    fun findAll() = repo.findAll()

    @Transactional(readOnly = true)
    fun getEventosByCasaId(casaId: Long): List<EventoResponseDTO>? {
        val casa = casaRepo.findByIdWithEventos(casaId) ?: return null

        return casa.eventos.map { evento -> toResponseDTO(evento) }
    }

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

        val asistentes = mutableSetOf<Usuario>().apply { add(creadoPor) }

        asistentes
            .filter { it.id != creadoPor.id }
            .forEach {
                firebaseMessagingService.enviarAUsuario(
                    it.id!!,
                    "Te han invitado a un evento",
                    "¡Preparate para la fiesta!",
                )
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

    fun borrarEvento(eventoId: Long): Boolean {
        val evento = repo.findById(eventoId).orElse(null) ?: return false

        val casaConEvento = casaRepo.findByEventosContains(evento).orElse(null)
        if (casaConEvento != null) {
            casaConEvento.eventos.remove(evento)
            casaRepo.save(casaConEvento)
        }

        repo.delete(evento)
        return true
    }

    fun actualizarEvento(
        eventoId: Long,
        request: EventoRequestDTO,
    ): EventoResponseDTO? {
        val evento = repo.findById(eventoId).orElse(null) ?: return null

        request.nombre.let { evento.nombre = it }
        request.descripcion?.let { evento.descripcion = it }
        request.fechaInicio.let { evento.fechaInicio = it }
        request.fechaFin?.let { evento.fechaFin = it }

        evento.asistentes.forEach { invitado ->
            firebaseMessagingService.enviarAUsuario(
                invitado.id!!,
                "Te han invitado a un evento",
                "¡Preparate para la fiesta!",
            )
        }

        val eventoActualizado = repo.save(evento)
        return toResponseDTO(eventoActualizado)
    }

    private fun toResponseDTO(evento: Evento): EventoResponseDTO =
        EventoResponseDTO(
            id = evento.id!!,
            nombre = evento.nombre,
            descripcion = evento.descripcion,
            fechaCreacion = evento.fechaCreacion.toString(),
            fechaInicio = evento.fechaInicio.toString(),
            fechaFin = evento.fechaFin?.toString(),
            creadoPor = evento.creadoPor.id!!,
            asistentes = evento.asistentes.map { it.id!! },
        )
}
