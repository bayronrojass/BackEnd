package org.pin.backend.repository
import org.pin.backend.model.Casa
import org.springframework.data.jpa.repository.JpaRepository

interface CasaRepository : JpaRepository<Casa, Long>