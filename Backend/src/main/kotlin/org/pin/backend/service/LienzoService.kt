package org.pin.backend.service
import jakarta.transaction.Transactional
import org.pin.backend.dto.PointDeltaDTO
import org.pin.backend.repository.LienzoRepository
import org.pin.backend.utils.Lienzo4bpp
import org.springframework.stereotype.Service
import java.awt.image.BufferedImage
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import javax.imageio.ImageIO

@Service
class LienzoService(
    private val repo: LienzoRepository,
) {
    fun findAll() = repo.findAll()

    fun findById(id: Long) = repo.findById(id)

    @Transactional
    fun applyDelta(id: Long, puntos: List<PointDeltaDTO>) {
        val lienzo = repo.findById(id).orElseThrow()
        val canvas = Lienzo4bpp(lienzo.width, lienzo.height, lienzo.bytes)

        if (puntos.isEmpty()) return

        var last = puntos[0]
        for (i in 1 until puntos.size) {
            val current = puntos[i]
            canvas.drawLine(last, current)
            last = current
        }
        
        repo.save(lienzo)
    }

    private fun decodeImage(bytes: ByteArray): BufferedImage {
        ByteArrayInputStream(bytes).use { input ->
            return ImageIO.read(input)
        }
    }

    private fun encodeImage(image: BufferedImage): ByteArray {
        ByteArrayOutputStream().use { output ->
            ImageIO.write(image, "png", output)
            return output.toByteArray()
        }
    }
}
