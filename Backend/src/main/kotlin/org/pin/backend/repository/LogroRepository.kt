package org.pin.backend.repository

import org.pin.backend.model.Logro
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LogroRepository : JpaRepository<Logro, Long> {
    fun findByCodigoStartingWithOrderByMetaAsc(prefijoCodigo: String): List<Logro>
}
