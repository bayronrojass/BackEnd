package org.pin.backend.repository
import org.pin.backend.model.Usuario
import org.pin.backend.model.Voto
import org.springframework.data.jpa.repository.JpaRepository

interface VotoRepository : JpaRepository<Voto, Long>{
    fun findByVotante(votante: Usuario): List<Voto>
}
