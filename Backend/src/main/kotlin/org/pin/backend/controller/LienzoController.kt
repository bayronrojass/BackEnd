package org.pin.backend.controller
import org.pin.backend.dto.DateDTO
import org.pin.backend.dto.PointDeltaDTO
import org.pin.backend.service.LienzoService
import org.pin.backend.utils.Lienzo4bpp
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.io.ByteArrayOutputStream
import javax.imageio.ImageIO
import kotlin.time.ExperimentalTime

@RestController
@RequestMapping("/lienzos")
class LienzoController(
    private val service: LienzoService,
) {
    @GetMapping("/{id}")
    fun getById(
        @PathVariable id: Long,
    ) = service.findById(id)

    @GetMapping("/{id}/png", produces = [MediaType.IMAGE_PNG_VALUE])
    fun getLienzoPng(
        @PathVariable id: Long,
    ): ResponseEntity<ByteArray> {
        val lienzo = service.findById(id)

        if (lienzo == null) {
            ResponseEntity.notFound()
        }

        val l4 = Lienzo4bpp(lienzo!!.width, lienzo.height, lienzo.getBytesDescomprimidos())
        val bmp = l4.toBufferedImage()
        return ResponseEntity.ok(
            ByteArrayOutputStream().use {
                ImageIO.write(bmp, "png", it)
                it.toByteArray()
            },
        )
    }

    @OptIn(ExperimentalTime::class)
    @GetMapping("/{id}/isUpdated")
    fun isUpdated(
        @PathVariable id: Long,
        @RequestBody time: DateDTO,
    ): ResponseEntity<Boolean> {
        val lienzo = service.findById(id)

        if (lienzo == null) {
            ResponseEntity.notFound()
        }

        return ResponseEntity.ok(lienzo!!.lastEdited > time.time)
    }

    @PostMapping("/{id}/deltas")
    fun postDeltas(
        @PathVariable id: Long,
        @RequestBody delta: List<PointDeltaDTO>,
    ): ResponseEntity<Boolean> = service.applyDelta(id, delta)
}
