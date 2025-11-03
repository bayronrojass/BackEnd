package org.pin.backend.repository

import org.pin.backend.model.EstadoInvitacion
import org.pin.backend.model.Invitacion
import org.springframework.data.jpa.repository.JpaRepository

interface InvitacionRepository : JpaRepository<Invitacion, Long> {


    fun findByDestinatarioIdAndEstado(destinatarioId: Long, estado: EstadoInvitacion): List<Invitacion>

    fun existsByCasaIdAndDestinatarioIdAndEstado(casaId: Long, destinatarioId: Long, estado: EstadoInvitacion): Boolean
}