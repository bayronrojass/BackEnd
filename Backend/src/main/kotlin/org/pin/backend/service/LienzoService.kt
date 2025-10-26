package org.pin.backend.service
import org.pin.backend.dto.PointDeltaDTO
import org.pin.backend.model.Lienzo
import org.pin.backend.repository.LienzoRepository
import org.springframework.stereotype.Service
import java.awt.BasicStroke
import java.awt.Color
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

    fun createDefault() : Lienzo {
        val bytes = ByteArray(1000 * 1000)
        bytes.fill(11)

        return repo.save(Lienzo(0, bytes, 2000, 2000))
    }

    fun applyDelta(
        id: Long,
        puntos: List<PointDeltaDTO>,
    ) {
        val lienzo = repo.findById(id).orElseThrow()
        val currentBitmap = decodeImage(lienzo.bytes)

        val g = currentBitmap.createGraphics()
        g.color = Color.BLACK
        g.stroke = BasicStroke(10f)

        if (puntos.size >= 2) {
            for (i in 0 until puntos.size - 1) {
                val p1 = puntos[i]
                val p2 = puntos[i + 1]
                g.drawLine(p1.x.toInt(), p1.y.toInt(), p2.x.toInt(), p2.y.toInt())
            }
        }
        g.dispose()

        lienzo.bytes = encodeImage(currentBitmap)
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
