package org.pin.backend.service

import org.pin.backend.model.Casa
import org.pin.backend.model.CasaRequest
import org.pin.backend.model.Lienzo
import org.pin.backend.repository.CasaRepository
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile // Importa MultipartFile
import java.time.LocalDateTime

@Service
class CasaService(
    private val repo: CasaRepository,
    private val fileStorageService: FileStorageService
) {
    fun findAll(): MutableList<Casa> = repo.findAll()

    fun crearNuevaCasa(request: CasaRequest, file: MultipartFile): Casa {


        val filename = fileStorageService.save(file)

        val nuevaCasa = Casa(
            nombre = request.nombre,
            descripcion = request.descripcion,
            rutaImagen = filename,
            fechaCreacion = LocalDateTime.now(),
            lienzo = Lienzo()
        )
        
        return repo.save(nuevaCasa)
    }
}