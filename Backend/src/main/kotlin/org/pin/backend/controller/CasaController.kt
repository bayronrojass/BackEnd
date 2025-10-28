package org.pin.backend.controller
import org.pin.backend.dto.CasaRequestDTO
import org.pin.backend.dto.CasaResponseDTO
import org.pin.backend.model.Casa
import org.pin.backend.repository.CasaRepository
import org.pin.backend.service.CasaService
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import org.pin.backend.model.Lista
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import java.util.*


@RestController
@RequestMapping("/casas")
class CasaController(
    private val service: CasaService,
    private val casaRepository: CasaRepository
) {
    @GetMapping
    fun getAll() = service.findAll()

    @PostMapping(consumes = ["multipart/form-data"])
    fun crearCasa(
        @RequestPart("casa") request: CasaRequestDTO,
        @RequestPart("file", required = false) file: MultipartFile?
    ): CasaResponseDTO {

        val casaGuardada = if(file != null && !file.isEmpty) {
            service.crearNuevaCasa(request,file)
        }
        else{
            service.crearNuevaCasaSinImagen(request)
        }

        return CasaResponseDTO(
            id = casaGuardada.id!!,
            nombre = casaGuardada.nombre,
            descripcion = casaGuardada.descripcion,
            fechaCreacion = casaGuardada.fechaCreacion
        )
    }

    @GetMapping("/{casaId}/listas")
    @Transactional(readOnly = true)
    fun getListasByCasaId(@PathVariable casaId: Long): ResponseEntity<List<Lista>> {
        val casaOptional: Optional<Casa> = casaRepository.findById(casaId)
        return if (casaOptional.isPresent) {
            val casa = casaOptional.get()
            // Accedemos a casa.listas DENTRO de la transacción
            ResponseEntity.ok(casa.listas.toList())
        } else {
            ResponseEntity.notFound().build() // Devuelve 404 si la casa no existe
        }
    }
}
