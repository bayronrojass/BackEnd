package org.pin.backend.controller
import org.pin.backend.dto.Data.PostItDTO
import org.pin.backend.service.CasaService
import org.pin.backend.service.LienzoService
import org.pin.backend.service.PostItService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/postits")
class PostItController(
    private val service: PostItService,
    private val casaService: CasaService,
    private val lienzoService: LienzoService,
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
                    postIt.lienzo!!.id!!,
                    postIt.posicionX,
                    postIt.posicionY,
                    postIt.width,
                    postIt.height,
                    postIt.plegado!!,
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
        @RequestBody postItDTO: PostItDTO,
    ): ResponseEntity<Boolean> {
        val multimedia = service.getById(postItDTO.id)
        if (multimedia.isPresent) {
            val multimediaIt = multimedia.get()
            multimediaIt.posicionX = postItDTO.posicionX
            multimediaIt.posicionY = postItDTO.posicionY
            multimediaIt.plegado = postItDTO.plegado
            service.save(multimediaIt)
            return ResponseEntity.ok(true)
        }
        return ResponseEntity.notFound().build()
    }
}
