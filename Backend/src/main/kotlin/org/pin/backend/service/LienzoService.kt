package org.pin.backend.service
import org.apache.commons.logging.Log
import org.apache.coyote.Response
import org.pin.backend.dto.PointDeltaDTO
import org.pin.backend.model.Lienzo
import org.pin.backend.repository.LienzoRepository
import org.pin.backend.utils.Lienzo4bpp
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.awt.BasicStroke
import java.awt.Color

@Service
class LienzoService(
    private val repo: LienzoRepository,
) {
    private val logger: Logger = LoggerFactory.getLogger(LienzoService::class.java)

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
    ): ResponseEntity<Boolean> {
        logger.info("Se están aplicando deltas")
        val lienzo = repo.findById(id).orElseThrow()
        val l4 = Lienzo4bpp(lienzo.width, lienzo.height, lienzo!!.bytes)
        val currentBitmap = l4.toBufferedImage()

        val g = currentBitmap.createGraphics()

        if (puntos.size >= 2) {
            for (i in 0 until puntos.size - 1) {
                if (puntos[i].size > 0) {
                    val color = Lienzo4bpp.palette[puntos[i].color.toInt()]
                    g.color = Color(color)
                    g.stroke = BasicStroke(puntos[i].size)
                    val p1 = puntos[i]
                    val p2 = puntos[i + 1]
                    g.drawLine(p1.x.toInt(), p1.y.toInt(), p2.x.toInt(), p2.y.toInt())
                }
            }
        }
        g.dispose()

        lienzo.bytes = Lienzo4bpp.encodeImage(currentBitmap)
        logger.info("Deltas aplicados")
        repo.save(lienzo)

        return ResponseEntity<Boolean>.ok(true)
    }
}
