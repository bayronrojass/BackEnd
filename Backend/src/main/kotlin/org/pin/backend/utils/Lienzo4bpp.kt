package org.pin.backend.utils

import org.pin.backend.dto.PointDeltaDTO
import java.awt.image.BufferedImage
import kotlin.math.sqrt
import kotlin.text.get

class Lienzo4bpp(
    val width: Short,
    val height: Short,
    val bytes: ByteArray,
) {
    companion object {
        val palette =
            arrayOf(
                0x00000000.toInt(), // transparente
                0xFF000000.toInt(), // negro
                0xFFFF0000.toInt(), // rojo
                0xFF00FF00.toInt(), // verde
                0xFF0000FF.toInt(), // azul
                0xFFFFFF00.toInt(), // amarillo
                0xFFFF00FF.toInt(), // magenta
                0xFF00FFFF.toInt(), // cyan
                0xFFFFFFFF.toInt(), // blanco
            )

        fun encodeImage(image: BufferedImage): ByteArray {
            val width = image.width
            val height = image.height
            val bytes = ByteArray((width * height + 1) / 2)

            for (y in 0 until height) {
                for (x in 0 until width) {
                    val index = y * width + x
                    val color = image.getRGB(x, y)

                    // Encontrar el índice del color en la paleta
                    val colorIndex = findColorIndexInPalette(color)

                    // Calcular posición en el array de bytes
                    val byteIndex = index / 2
                    val isHigh = index % 2 == 0

                    // Empaquetar dos píxeles en un byte
                    if (isHigh) {
                        bytes[byteIndex] = (colorIndex shl 4).toByte()
                    } else {
                        val currentValue = bytes[byteIndex].toInt() and 0xFF
                        bytes[byteIndex] = (currentValue or colorIndex).toByte()
                    }
                }
            }

            return bytes
        }

        private fun findColorIndexInPalette(color: Int): Int {
            var minDistance = Int.MAX_VALUE
            var bestIndex = 0

            for (i in palette.indices) {
                val distance = colorDistance(color, palette[i])
                if (distance < minDistance) {
                    minDistance = distance
                    bestIndex = i
                }

                if (distance == 0) break
            }

            return bestIndex
        }

        private fun colorDistance(
            color1: Int,
            color2: Int,
        ): Int {
            val a1 = (color1 shr 24) and 0xFF
            val r1 = (color1 shr 16) and 0xFF
            val g1 = (color1 shr 8) and 0xFF
            val b1 = color1 and 0xFF

            val a2 = (color2 shr 24) and 0xFF
            val r2 = (color2 shr 16) and 0xFF
            val g2 = (color2 shr 8) and 0xFF
            val b2 = color2 and 0xFF

            return (a1 - a2) * (a1 - a2) +
                (r1 - r2) * (r1 - r2) +
                (g1 - g2) * (g1 - g2) +
                (b1 - b2) * (b1 - b2)
        }
    }

    fun getPixel(
        x: Short,
        y: Short,
    ): Int {
        val index = y * width + x
        val byteIndex = index / 2
        val isHigh = index % 2 == 0
        val value = bytes[byteIndex].toInt() and 0xFF
        return if (isHigh) (value shr 4) and 0x0F else value and 0x0F
    }

    fun toBufferedImage(): BufferedImage {
        val img = BufferedImage(width.toInt(), height.toInt(), BufferedImage.TYPE_INT_ARGB)

        for (y in 0..height - 1) {
            for (x in 0..width - 1) {
                val color = palette[getPixel(x.toShort(), y.toShort())]

                img.setRGB(x, y, color)
            }
        }
        return img
    }
}
