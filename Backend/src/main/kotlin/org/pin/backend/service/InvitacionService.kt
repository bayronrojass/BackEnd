package org.pin.backend.service

import org.pin.backend.model.Invitacion
import org.pin.backend.model.enums.EstadoInvitacion
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.InvitacionRepository
import org.pin.backend.repository.UsuarioRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class InvitacionService(
    private val invitacionRepository: InvitacionRepository,
    private val usuarioRepository: UsuarioRepository,
    private val casaRepository: CasaRepository,
    private val firebaseMessagingService: FirebaseMessagingService,
) {
    /**
     * Crea una nueva invitación.
     * @param remitenteId El ID del usuario autenticado (quien envía).
     */
    fun crearInvitacion(
        casaId: Long,
        emailDestinatario: String,
        remitenteId: Long,
    ): Invitacion {
        val remitente =
            usuarioRepository
                .findById(remitenteId)
                .orElseThrow { Exception("Usuario remitente no encontrado") }

        val destinatario =
            usuarioRepository
                .findByCorreo(emailDestinatario)
                .orElseThrow { Exception("No existe un usuario con el email: $emailDestinatario") }

        val casa =
            casaRepository
                .findById(casaId)
                .orElseThrow { Exception("Casa no encontrada") }

        if (casa.miembros.none { it.id == remitente.id }) {
            throw Exception("No tienes permiso para invitar a esta casa (no eres miembro)")
        }

        if (casa.miembros.any { it.id == destinatario.id }) {
            throw Exception("El usuario ya es miembro de esta casa")
        }

        if (invitacionRepository.existsByCasaIdAndDestinatarioIdAndEstado(casaId, destinatario.id!!, EstadoInvitacion.PENDIENTE)) {
            throw Exception("Ya existe una invitación pendiente para este usuario en esta casa")
        }

        val nuevaInvitacion =
            Invitacion(
                remitente = remitente,
                destinatario = destinatario,
                casa = casa,
            )

        val invitacionGuardada = invitacionRepository.save(nuevaInvitacion)
        firebaseMessagingService.enviarAUsuario(destinatario.id!!, "¡Nueva invitación!", "¡Tienes una nueva invitación! ¡Vamos a verla!")

        return invitacionGuardada
    }

    fun getMisInvitacionesPendientes(destinatarioId: Long): List<Invitacion> =
        invitacionRepository.findByDestinatarioIdAndEstado(destinatarioId, EstadoInvitacion.PENDIENTE)

    fun aceptarInvitacion(
        invitacionId: Long,
        usuarioId: Long,
    ): Invitacion {
        val invitacion =
            invitacionRepository
                .findById(invitacionId)
                .orElseThrow { Exception("Invitación no encontrada") }

        // Validar que el usuario actual es el destinatario
        if (invitacion.destinatario.id != usuarioId) {
            throw Exception("No tienes permiso para aceptar esta invitación")
        }

        if (invitacion.estado != EstadoInvitacion.PENDIENTE) {
            throw Exception("Esta invitación ya fue respondida")
        }

        val casa = invitacion.casa

        casa.miembros.add(invitacion.destinatario)
        casaRepository.save(casa)

        invitacion.estado = EstadoInvitacion.ACEPTADA
        return invitacionRepository.save(invitacion)
    }

    fun rechazarInvitacion(
        invitacionId: Long,
        usuarioId: Long,
    ): Invitacion {
        val invitacion =
            invitacionRepository
                .findById(invitacionId)
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
