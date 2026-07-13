package org.pin.backend.service

import org.pin.backend.dto.Data.CasaDTO
import org.pin.backend.dto.Request.CasaRequestDTO
import org.pin.backend.dto.Response.UsuarioRankingDTO
import org.pin.backend.model.Casa
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.UsuarioRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.multipart.MultipartFile
import java.time.LocalDateTime
import java.util.*

@Service
@Transactional
class CasaService(
    private val repo: CasaRepository,
    private val usuarioRepository: UsuarioRepository,
    private val fileStorageService: FileStorageService,
) {
    @Transactional(readOnly = true)
    fun findAll(): MutableList<Casa> = repo.findAll()

    @Transactional(readOnly = true)
    fun findById(id: Long): Optional<Casa> = repo.findById(id)

    fun save(casa: Casa): Casa = repo.save(casa)

    fun crearNuevaCasa(
        request: CasaRequestDTO,
        file: MultipartFile,
    ): Casa {
        val filename = fileStorageService.save(file)

        val nuevaCasa =
            Casa(
                nombre = request.nombre,
                descripcion = request.descripcion,
                rutaImagen = filename,
                fechaCreacion = LocalDateTime.now(),
            )

        return repo.save(nuevaCasa)
    }

    fun crearNuevaCasaSinImagen(request: CasaRequestDTO): Casa {
        val nuevaCasa =
            Casa(
                nombre = request.nombre,
                descripcion = request.descripcion,
                rutaImagen = null,
                fechaCreacion = LocalDateTime.now(),
            )

        return repo.save(nuevaCasa)
    }

    @Transactional(readOnly = true)
    fun obtenerCasasDeUsuario(usuarioId: Long): List<CasaDTO> {
        val usuario =
            usuarioRepository
                .findById(usuarioId)
                .orElseThrow { Exception("Usuario no encontrado") }

        val casas = repo.findByMiembrosContains(usuario)

        return casas.map { casa ->
            CasaDTO(
                id = casa.id!!,
                nombre = casa.nombre,
                descripcion = casa.descripcion,
                rutaImagen = casa.rutaImagen,
                fechaCreacion = casa.fechaCreacion,
            )
        }
    }

    fun removeMiembro(
        casaId: Long,
        usuarioId: Long,
    ): Boolean {
        val casa = repo.findById(casaId).orElse(null) ?: return false
        val usuario = usuarioRepository.findById(usuarioId).orElse(null) ?: return false

        casa.miembros.remove(usuario)
        casa.administradores.remove(usuario)
        repo.save(casa)
        return true
    }

    @Transactional(readOnly = true)
    fun getRankingCasa(casaId: Long): List<UsuarioRankingDTO>? {
        val casa = repo.findByIdWithMiembros(casaId) ?: return null

        return casa.miembros
            .sortedByDescending { it.puntosConvivencia }
            .mapIndexed { index, usuario ->
                UsuarioRankingDTO(
                    posicion = index + 1,
                    usuarioId = usuario.id!!,
                    nombre = usuario.nombre,
                    fotoUrl = usuario.fotoUrl,
                    puntos = usuario.puntosConvivencia,
                )
            }
    }
}
