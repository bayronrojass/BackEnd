package org.pin.backend.controller
import org.pin.backend.dto.PointDeltaDTO
import org.pin.backend.service.LienzoService
import org.pin.backend.utils.Lienzo4bpp
import org.slf4j.Logger
import org.slf4j.LoggerFactory
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
    private val logger: Logger = LoggerFactory.getLogger(LienzoService::class.java)
) {
    @GetMapping("/{id}")
    fun getById(
        @PathVariable id: Long,
    ) = service.findById(id)

    @GetMapping("/{id}/png", produces = [MediaType.IMAGE_PNG_VALUE])
    fun getLienzoPng(
        @PathVariable id: Long,
    ): ResponseEntity<ByteArray> {
        logger.info("Cargando $id")
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

        val lastEditedMillis = lienzo!!.lastEdited.toEpochMilli() / 1000

        logger.info("$id ${lastEditedMillis > (time / 1000) - 1} $lastEditedMillis ${time/1000}")
        return ResponseEntity.ok(lastEditedMillis > (time / 1000) - 1 )
    }

    @PostMapping("/{id}/deltas")
    fun postDeltas(
        @PathVariable id: Long,
        @RequestBody delta: List<PointDeltaDTO>,
    ): ResponseEntity<Boolean> = service.applyDelta(id, delta)
}
