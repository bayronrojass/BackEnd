package org.pin.backend.repository
import org.pin.backend.model.Lienzo
import org.springframework.data.jpa.repository.JpaRepository

interface LienzoRepository : JpaRepository<Lienzo, Long>
