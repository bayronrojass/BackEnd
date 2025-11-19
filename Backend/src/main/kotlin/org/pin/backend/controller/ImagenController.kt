package org.pin.backend.controller
import org.pin.backend.dto.Data.ImagenDTO
import org.pin.backend.service.CasaService
import org.pin.backend.service.ImagenService
import org.pin.backend.service.LienzoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/imagenes")
class ImagenController(
    private val service: ImagenService,
    private val casaService: CasaService,
    private val lienzoService: LienzoService,
) {
    @GetMapping
    fun getAll() = service.findAll()

    @GetMapping("{id}")
    fun getById(
        @PathVariable id: Long,
    ): ResponseEntity<ImagenDTO> {
        val imagen = service.getById(id)
        if (imagen.isPresent) {
            val imagen = imagen.get()
            return ResponseEntity.ok(
                ImagenDTO(
                    imagen.id!!,
                    imagen.lienzo!!.id!!,
                    imagen.posicionX,
                    imagen.posicionY,
                    imagen.width,
                    imagen.height,
                    imagen.plegado == true,
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
                lienzoService.delete(multimediaIt.lienzo!!)
                service.deleteById(id)
                return ResponseEntity.ok(true)
            }
        }
        return ResponseEntity.notFound().build()
    }

    @PostMapping("/pos")
    fun updatePosition(
        @RequestBody imagenDTO: ImagenDTO,
    ): ResponseEntity<Boolean> {
        val multimedia = service.getById(imagenDTO.id)
        if (multimedia.isPresent) {
            val multimediaIt = multimedia.get()
            multimediaIt.posicionX = imagenDTO.posicionX
            multimediaIt.posicionY = imagenDTO.posicionY
            multimediaIt.plegado = imagenDTO.plegado
            service.save(multimediaIt)
            return ResponseEntity.ok(true)
        }
        return ResponseEntity.notFound().build()
    }
}
