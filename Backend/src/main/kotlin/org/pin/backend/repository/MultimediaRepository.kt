package org.pin.backend.repository
import org.pin.backend.model.Multimedia
import org.springframework.data.jpa.repository.JpaRepository

interface MultimediaRepository : JpaRepository<Multimedia, Long>
