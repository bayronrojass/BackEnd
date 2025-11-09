package org.pin.backend.repository
import org.pin.backend.model.Elemento
import org.springframework.data.jpa.repository.JpaRepository

interface ElementoRepository : JpaRepository<Elemento, Long>
