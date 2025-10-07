package org.pin.backend.repository
import org.pin.backend.model.Audio
import org.springframework.data.jpa.repository.JpaRepository

interface AudioRepository : JpaRepository<Audio, Long>
