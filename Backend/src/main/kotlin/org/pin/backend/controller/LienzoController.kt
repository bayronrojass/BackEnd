package org.pin.backend.controller
import org.pin.backend.dto.Data.PointDeltaDTO
import org.pin.backend.service.LienzoService
import org.pin.backend.utils.Lienzo4bpp
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.io.ByteArrayInputStream
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

    @GetMapping("/{id}/imagen")
    fun getLienzoImagen(
        @PathVariable id: Long,
    ): ResponseEntity<ByteArray> {
        val lienzo = service.findById(id) ?: return ResponseEntity.notFound().build()

        val formato = lienzo.format?.lowercase() ?: "png"

        val bufferedImage =
            if (!lienzo.isImage) {
                val l4 = Lienzo4bpp(lienzo.width, lienzo.height, lienzo.getBytesDescomprimidos())
                l4.toBufferedImage()
            } else {
                ByteArrayInputStream(lienzo.bytes).use { input ->
                    ImageIO.read(input)
                } ?: return ResponseEntity.badRequest().build()
            }

        val bytes =
            ByteArrayOutputStream().use {
                ImageIO.write(bufferedImage, formato, it)
                it.toByteArray()
            }

        val mediaType =
            when (formato) {
                "jpg", "jpeg" -> MediaType.IMAGE_JPEG
                "png" -> MediaType.IMAGE_PNG
                "gif" -> MediaType.IMAGE_GIF
                else -> MediaType.APPLICATION_OCTET_STREAM
            }

        return ResponseEntity
            .ok()
            .contentType(mediaType)
            .body(bytes)
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
        return ResponseEntity.ok(lastEditedMillis > (time / 1000) - 1)
    }

    @PostMapping("/{id}/deltas")
    fun postDeltas(
        @PathVariable id: Long,
        @RequestBody delta: List<PointDeltaDTO>,
    ): ResponseEntity<Boolean> = service.applyDelta(id, delta)

    /**
     * Wipe the server-side composited bitmap for this lienzo to a blank white surface.
     * Frontend calls this from the "Borrar" control-panel button so pre-clear strokes
     * don't resurrect on the next `applyDelta` (server had been compositing new deltas
     * onto the old bitmap) or on the next poll fetch (server was returning old bytes).
     */
    @PutMapping("/{id}/clear")
    fun clearLienzo(
        @PathVariable id: Long,
    ): ResponseEntity<Boolean> = service.clearLienzo(id)
}
