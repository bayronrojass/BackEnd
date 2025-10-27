package org.pin.backend.controller
import org.pin.backend.dto.CasaRequestDTO
import org.pin.backend.dto.CasaResponseDTO
import org.pin.backend.service.CasaService
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/casas")
class CasaController(
    private val service: CasaService,
) {
    @GetMapping
    fun getAll() = service.findAll()

    @PostMapping(consumes = ["multipart/form-data"])
    fun crearCasa(
        @RequestPart("casa") request: CasaRequestDTO,
        @RequestPart("file") file: MultipartFile,
    ): CasaResponseDTO {
        val casaGuardada = service.crearNuevaCasa(request, file)

        return CasaResponseDTO(
            id = casaGuardada.id!!,
            nombre = casaGuardada.nombre,
            descripcion = casaGuardada.descripcion,
            fechaCreacion = casaGuardada.fechaCreacion,
        )
    }
}
