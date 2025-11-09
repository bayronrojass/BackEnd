package org.pin.backend.repository
import org.pin.backend.model.Imagen
import org.springframework.data.jpa.repository.JpaRepository

interface ImagenRepository : JpaRepository<Imagen, Long>
