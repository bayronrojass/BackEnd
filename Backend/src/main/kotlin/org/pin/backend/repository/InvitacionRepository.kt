package org.pin.backend.repository

import org.pin.backend.model.Invitacion
import org.pin.backend.model.Usuario
import org.pin.backend.model.enums.EstadoInvitacion
import org.springframework.data.jpa.repository.JpaRepository

interface InvitacionRepository : JpaRepository<Invitacion, Long> {
    fun findByDestinatarioIdAndEstado(
        destinatarioId: Long,
        estado: EstadoInvitacion,
    ): List<Invitacion>

    fun existsByCasaIdAndDestinatarioIdAndEstado(
        casaId: Long,
        destinatarioId: Long,
        estado: EstadoInvitacion,
    ): Boolean

    fun findByRemitente(remitente: Usuario): List<Invitacion>

    fun findByDestinatario(destinatario: Usuario): List<Invitacion>
}
