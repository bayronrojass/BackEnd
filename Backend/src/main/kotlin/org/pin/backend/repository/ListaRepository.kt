package org.pin.backend.repository
import org.pin.backend.model.Lista
import org.springframework.data.jpa.repository.JpaRepository

interface ListaRepository : JpaRepository<Lista, Long>
