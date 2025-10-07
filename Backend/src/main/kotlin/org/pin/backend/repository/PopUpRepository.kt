package org.pin.backend.repository
import org.pin.backend.model.PopUp
import org.springframework.data.jpa.repository.JpaRepository

interface PopUpRepository : JpaRepository<PopUp, Long>
