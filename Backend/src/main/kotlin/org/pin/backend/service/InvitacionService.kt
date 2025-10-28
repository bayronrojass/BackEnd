package org.pin.backend.service

import org.pin.backend.model.EstadoInvitacion
import org.pin.backend.model.Invitacion
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.InvitacionRepository
import org.pin.backend.repository.UsuarioRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional // Importante para manejar múltiples operaciones de BD
class InvitacionService(
    private val invitacionRepository: InvitacionRepository,
    private val usuarioRepository: UsuarioRepository,
    private val casaRepository: CasaRepository
    // TODO: Inyectar el MqttService para notificaciones en tiempo real
) {


    fun crearInvitacion(casaId: Long, emailDestinatario: String, remitenteId: Long): Invitacion {
        val remitente = usuarioRepository.findById(remitenteId)
            .orElseThrow { Exception("Usuario remitente no encontrado") }

        val destinatario = usuarioRepository.findByCorreo(emailDestinatario)
            ?: throw Exception("No existe un usuario con el email: $emailDestinatario")

        val casa = casaRepository.findById(casaId)
            .orElseThrow { Exception("Casa no encontrada") }

        // --- Validaciones de negocio ---
        if (casa.miembros.any { it.id == destinatario.id }) {
            throw Exception("El usuario ya es miembro de esta casa")
        }

        if (invitacionRepository.existsByCasaIdAndDestinatarioIdAndEstado(casaId, destinatario.id!!, EstadoInvitacion.PENDIENTE)) {
            throw Exception("Ya existe una invitación pendiente para este usuario")
        }

        val nuevaInvitacion = Invitacion(
            remitente = remitente,
            destinatario = destinatario,
            casa = casa
        )

        val invitacionGuardada = invitacionRepository.save(nuevaInvitacion)

        // mqttService.publicarInvitacion(destinatario.id, "¡Nueva invitación!")

        return invitacionGuardada
    }

    fun getMisInvitacionesPendientes(destinatarioId: Long): List<Invitacion> {
        return invitacionRepository.findByDestinatarioIdAndEstado(destinatarioId, EstadoInvitacion.PENDIENTE)
    }

    fun aceptarInvitacion(invitacionId: Long, usuarioId: Long): Invitacion {
        val invitacion = invitacionRepository.findById(invitacionId)
            .orElseThrow { Exception("Invitación no encontrada") }

        if (invitacion.destinatario.id != usuarioId) {
            throw Exception("No tienes permiso para aceptar esta invitación")
        }

        if (invitacion.estado != EstadoInvitacion.PENDIENTE) {
            throw Exception("Esta invitación ya fue respondida")
        }

        val casa = invitacion.casa
        casa.miembros.add(invitacion.destinatario)
        casaRepository.save(casa) // Guardamos la casa actualizada

        invitacion.estado = EstadoInvitacion.ACEPTADA
        return invitacionRepository.save(invitacion)
    }

    fun rechazarInvitacion(invitacionId: Long, usuarioId: Long): Invitacion {
        val invitacion = invitacionRepository.findById(invitacionId)
            .orElseThrow { Exception("Invitación no encontrada") }

        if (invitacion.destinatario.id != usuarioId) {
            throw Exception("No tienes permiso para rechazar esta invitación")
        }

        if (invitacion.estado != EstadoInvitacion.PENDIENTE) {
            throw Exception("Esta invitación ya fue respondida")
        }

        invitacion.estado = EstadoInvitacion.RECHAZADA
        return invitacionRepository.save(invitacion)
    }
}