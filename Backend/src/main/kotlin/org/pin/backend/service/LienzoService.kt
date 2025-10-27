package org.pin.backend.service
import org.pin.backend.dto.PointDeltaDTO
import org.pin.backend.model.Lienzo
import org.pin.backend.repository.LienzoRepository
import org.pin.backend.utils.LZ4Compression
import org.pin.backend.utils.Lienzo4bpp
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.awt.BasicStroke
import java.awt.Color
import java.awt.RenderingHints
import java.awt.geom.GeneralPath
import java.time.LocalDateTime
import kotlin.time.ExperimentalTime

@Service
class LienzoService(
    private val repo: LienzoRepository,
) {
    private val logger: Logger = LoggerFactory.getLogger(LienzoService::class.java)

    fun findById(id: Long): Lienzo? =
        repo.findById(id).orElseThrow().let { lienzo ->
            if (LZ4Compression.isCompressed(lienzo.bytes)) {
                lienzo.bytes = lienzo.getBytesDescomprimidos()
                lienzo
            } else {
                lienzo
            }
        }

    fun save(lienzo: Lienzo): Lienzo = repo.save(lienzo.comprimirYGuardar())

    @OptIn(ExperimentalTime::class)
    fun createDefault(): Lienzo {
        val bytes = ByteArray(1000 * 1000)
        bytes.fill(11)

        return save(Lienzo(0, LZ4Compression.compress(bytes), 2000, 2000, LocalDateTime.now()))
    }

    @OptIn(ExperimentalTime::class)
    fun applyDelta(
        id: Long,
        puntos: List<PointDeltaDTO>,
    ): ResponseEntity<Boolean> {
        logger.info("Se están aplicando deltas")
        val lienzo = repo.findById(id).orElseThrow()
        val l4 = Lienzo4bpp(lienzo.width, lienzo.height, lienzo!!.bytes)
        val currentBitmap = l4.toBufferedImage()

        val g = currentBitmap.createGraphics()

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)
        g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE)

        if (puntos.size >= 2) {
            val path = GeneralPath()
            val firstPoint = puntos.first()
            path.moveTo(firstPoint.x, firstPoint.y)

            for (i in 1 until puntos.size - 1) {
                if (puntos[i - 1].size > 0f) {
                    val color = Lienzo4bpp.palette[puntos[i - 1].color.toInt()]
                    g.color = Color(color)
                    g.stroke =
                        BasicStroke(
                            puntos[i - 1].size,
                            BasicStroke.CAP_BUTT,
                            BasicStroke.JOIN_ROUND,
                        )

                    val p1 = puntos[i - 1]
                    val p2 = puntos[i]
                    val midX = (p1.x + p2.x) / 2
                    val midY = (p1.y + p2.y) / 2
                    path.quadTo(
                        p1.x,
                        p1.y,
                        midX,
                        midY,
                    )
                } else {
                    path.moveTo(puntos[i].x, puntos[i].y)
                }
            }

            g.draw(path)
        } else if (puntos.size == 1) {
            val point = puntos.first()
            val radius = puntos[0].size / 2
            g.fillOval(
                (point.x - radius).toInt(),
                (point.y - radius).toInt(),
                puntos[0].size.toInt(),
                puntos[0].size.toInt(),
            )
        }
        g.dispose()

        lienzo.bytes = Lienzo4bpp.encodeImage(currentBitmap)
        save(lienzo)
        logger.info("Deltas aplicados")

        return ResponseEntity<Boolean>.ok(true)
    }
}
