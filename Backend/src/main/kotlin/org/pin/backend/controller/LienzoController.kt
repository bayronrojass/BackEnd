package org.pin.backend.controller
import org.pin.backend.dto.PointDeltaDTO
import org.pin.backend.service.LienzoService
import org.pin.backend.utils.Lienzo4bpp
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.io.ByteArrayOutputStream
import java.time.LocalDateTime
import java.time.ZoneId
import javax.imageio.ImageIO
import kotlin.time.ExperimentalTime
import kotlin.time.Instant

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
        @RequestParam time: Long,
    ): ResponseEntity<Boolean> {
        val lienzo = service.findById(id)

        if (lienzo == null) {
            ResponseEntity.notFound()
        }

        val lastEditedMillis = lienzo!!.lastEdited
            .atZone(ZoneId.systemDefault())
            .toInstant()
            .toEpochMilli()

        return ResponseEntity.ok(lastEditedMillis > time)
    }

    @PostMapping("/{id}/deltas")
    fun postDeltas(
        @PathVariable id: Long,
        @RequestBody delta: List<PointDeltaDTO>,
    ): ResponseEntity<Boolean> = service.applyDelta(id, delta)
}
