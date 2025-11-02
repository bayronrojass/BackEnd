package org.pin.backend.service

import org.pin.backend.dto.CasaRequestDTO
import org.pin.backend.model.Casa
import org.pin.backend.repository.CasaRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile // Importa MultipartFile
import java.time.LocalDateTime
import java.util.Optional

@Service
class CasaService(
    private val repo: CasaRepository,
    private val lienzoService: LienzoService,
    private val fileStorageService: FileStorageService,
) {
    fun findAll(): MutableList<Casa> = repo.findAll()

    fun findById(id: Long) : Optional<Casa> = repo.findById(id)

    fun save(casa: Casa) : Casa = repo.save(casa)

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
                lienzo = lienzoService.createDefault(),
            )

        return repo.save(nuevaCasa)
    }
}
