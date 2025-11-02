package org.pin.backend.controller
import org.pin.backend.dto.CasaRequestDTO
import org.pin.backend.dto.CasaResponseDTO
import org.pin.backend.dto.PostItDTO
import org.pin.backend.model.PostIt
import org.pin.backend.service.CasaService
import org.pin.backend.service.PostItService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/casas")
class CasaController(
    private val service: CasaService,
    private val postItService: PostItService,
) {
    private val logger: Logger = LoggerFactory.getLogger(CasaController::class.java)
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

    @GetMapping("/{id}/lienzo")
    fun getLienzo(
        @PathVariable id: Long,
    ): ResponseEntity<Long> {
        logger.info("Getting Lienzo by id {}", id)
        val casa = service.findById(id)
        if (casa.isPresent) {
            return ResponseEntity.ok(casa.get().lienzo.id)
        }
        return ResponseEntity.notFound().build()
    }

    @PostMapping("/{id}/postIt")
    fun crearPostIt(
        @PathVariable id: Long,
    ): ResponseEntity<PostItDTO> {
        val casa = service.findById(id)
        if (casa.isPresent) {
            val postIt = postItService.new(casa.get())
            casa.get().multimedia.add(postIt)
            service.save(casa.get())
            logger.info("$postIt ${postIt.id}")
            return ResponseEntity.ok(PostItDTO(postIt.id!!, 0, 0f, 0f, false))
        }
        return ResponseEntity.notFound().build()
    }

    @GetMapping("/{id}/postIt")
    fun getPostIt(
        @PathVariable id: Long,
    ): ResponseEntity<List<Long>> {
        val casa = service.findById(id)
        if (casa.isPresent) {
            val lista = casa.get().multimedia.filterIsInstance<PostIt>().map { it.id!! }.toList()
            return ResponseEntity.ok(lista)
        }
        return ResponseEntity.notFound().build()
    }
}