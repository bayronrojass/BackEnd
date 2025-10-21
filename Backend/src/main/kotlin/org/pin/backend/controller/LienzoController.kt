package org.pin.backend.controller
import org.pin.backend.dto.PointDeltaDTO
import org.pin.backend.service.LienzoService
import org.pin.backend.utils.Lienzo4bpp
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import java.io.ByteArrayOutputStream
import javax.imageio.ImageIO

@RestController
@RequestMapping("/lienzos")
class LienzoController(
    private val service: LienzoService,
) {
    @GetMapping
    fun getAll() = service.findAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long) = service.findById(id)

    @GetMapping("/{id}/png", produces = [MediaType.IMAGE_PNG_VALUE])
    fun getLienzoPng(@PathVariable id: Long): ByteArray {
        val lienzo = service.findById(id).orElseThrow()
        val l4 = Lienzo4bpp(lienzo.width, lienzo.height, lienzo!!.bytes)
        val bmp = l4.toBufferedImage()
        return ByteArrayOutputStream().use {
            ImageIO.write(bmp, "png", it)
            it.toByteArray()
        }
    }

    @PostMapping("/{id}/deltas")
    fun postDeltas(@PathVariable id: Long, @RequestBody delta: List<PointDeltaDTO>) = service.applyDelta(id, delta)
}
