package org.pin.backend.service

import org.pin.backend.dto.CasaRequestDTO
import org.pin.backend.model.Casa
import org.pin.backend.model.Lienzo
import org.pin.backend.repository.CasaRepository
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile // Importa MultipartFile
import java.time.LocalDateTime

@Service
class CasaService(
    private val repo: CasaRepository,
    private val lienzoService: LienzoService,
    private val fileStorageService: FileStorageService
) {
    fun findAll(): MutableList<Casa> = repo.findAll()

    fun crearNuevaCasa(request: CasaRequestDTO, file: MultipartFile): Casa {
        val filename = fileStorageService.save(file)

        val nuevaCasa = Casa(
            nombre = request.nombre,
            descripcion = request.descripcion,
            rutaImagen = filename,
            fechaCreacion = LocalDateTime.now(),
            //lienzo = lienzoService.createDefault()
        )

        return repo.save(nuevaCasa)
    }

    fun crearNuevaCasaSinImagen(request: CasaRequestDTO): Casa {

        val nuevaCasa = Casa(
            nombre = request.nombre,
            descripcion = request.descripcion,
            rutaImagen = null,
            fechaCreacion = LocalDateTime.now()
        )

        return repo.save(nuevaCasa)
    }
}