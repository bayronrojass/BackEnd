package org.pin.backend.controller

import org.pin.backend.model.CasaRequest
import org.pin.backend.model.CasaResponse
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
        @RequestPart("casa") request: CasaRequest,
        @RequestPart("file") file: MultipartFile
    ): CasaResponse {

        val casaGuardada = service.crearNuevaCasa(request, file)

        return CasaResponse(
            id = casaGuardada.id!!,
            nombre = casaGuardada.nombre,
            descripcion = casaGuardada.descripcion,
            fechaCreacion = casaGuardada.fechaCreacion
        )
    }
}