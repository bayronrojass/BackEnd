package org.pin.backend.controller
import org.pin.backend.dto.Data.PostItDTO
import org.pin.backend.security.CasaMembershipValidator
import org.pin.backend.service.CasaService
import org.pin.backend.service.LienzoService
import org.pin.backend.service.PostItService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import java.nio.file.Files
import java.nio.file.Paths

@RestController
@RequestMapping("/postits")
class PostItController(
    private val service: PostItService,
    private val casaService: CasaService,
    private val lienzoService: LienzoService,
    private val membershipValidator: CasaMembershipValidator,
) {
    @GetMapping
    fun getAll() = service.findAll()

    @GetMapping("{id}")
    fun getById(
        @PathVariable id: Long,
    ): ResponseEntity<PostItDTO> {
        val postit = service.getById(id)
        if (postit.isPresent) {
            val postIt = postit.get()
            return ResponseEntity.ok(
                PostItDTO(
                    postIt.id!!,
                    postIt.lienzo?.id,
                    postIt.posicionX,
                    postIt.posicionY,
                    postIt.width,
                    postIt.height,
                    postIt.localizacion,
                    postIt.tipo,
                    postIt.rutaAudio,
                ),
            )
        }
        return ResponseEntity.notFound().build()
    }

    @DeleteMapping("{id}")
    fun deleteById(
        @PathVariable id: Long,
    ): ResponseEntity<Boolean> {
        val multimedia = service.getById(id)
        if (multimedia.isPresent) {
            val multimediaIt = multimedia.get()
            if (multimediaIt.casa != null) {
                multimediaIt.casa?.multimedia?.remove(multimediaIt)
                casaService.save(multimediaIt.casa!!)

                // Limpieza condicional según el tipo
                if (multimediaIt.tipo == "DIBUJO" && multimediaIt.lienzo != null) {
                    lienzoService.delete(multimediaIt.lienzo!!)
                } else if (multimediaIt.tipo == "AUDIO" && multimediaIt.rutaAudio != null) {
                    try {
                        val path = Paths.get(multimediaIt.rutaAudio!!.removePrefix("/"))
                        Files.deleteIfExists(path)
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }

                service.deleteById(id)
                return ResponseEntity.ok(true)
            }
        }
        return ResponseEntity.notFound().build()
    }

    @PostMapping("/pos")
    fun updatePosition(
        @RequestBody postItDTO: PostItDTO,
    ): ResponseEntity<Boolean> {
        val multimedia = service.getById(postItDTO.id!!)
        if (multimedia.isPresent) {
            val multimediaIt = multimedia.get()
            multimediaIt.posicionX = postItDTO.posicionX
            multimediaIt.posicionY = postItDTO.posicionY
            service.save(multimediaIt)
            return ResponseEntity.ok(true)
        }
        return ResponseEntity.notFound().build()
    }

    // NUEVO ENDPOINT: Sube el audio y crea la nota en la pizarra
    @PostMapping("/casa/{casaId}/audio", consumes = ["multipart/form-data"])
    fun createAudioPostIt(
        @PathVariable casaId: Long,
        @RequestParam("location") location: String,
        @RequestParam("file") file: MultipartFile,
    ): ResponseEntity<PostItDTO> {
        membershipValidator.validateMembership(casaId)
        val casaOpt = casaService.findById(casaId)
        if (casaOpt.isEmpty) return ResponseEntity.notFound().build()

        val nuevoAudio = service.newAudio(casaOpt.get(), location, file)

        return ResponseEntity.ok(
            PostItDTO(
                nuevoAudio.id!!,
                null,
                nuevoAudio.posicionX,
                nuevoAudio.posicionY,
                nuevoAudio.width,
                nuevoAudio.height,
                nuevoAudio.localizacion,
                nuevoAudio.tipo,
                nuevoAudio.rutaAudio,
            ),
        )
    }
}
