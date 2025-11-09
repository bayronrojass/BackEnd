package org.pin.backend.repository
import org.pin.backend.model.Push
import org.springframework.data.jpa.repository.JpaRepository

interface PushRepository : JpaRepository<Push, Long>
