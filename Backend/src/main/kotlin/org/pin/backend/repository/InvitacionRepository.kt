package org.pin.backend.repository

import org.pin.backend.model.Invitacion
import org.springframework.data.jpa.repository.JpaRepository

interface InvitacionRepository : JpaRepository<Invitacion, Long>