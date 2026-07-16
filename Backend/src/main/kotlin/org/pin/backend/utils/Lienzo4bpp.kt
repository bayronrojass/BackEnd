package org.pin.backend.utils

import java.awt.image.BufferedImage

class Lienzo4bpp(
    val width: Short,
    val height: Short,
    val bytes: ByteArray,
) {
    companion object {
        /**
         * Palette must match `PizarraView.createPaint` on the Android client EXACTLY —
         * strokes come in on the wire as `PointDeltaDTO.color: Byte`, and that byte is
         * used as a direct index into this array (see `LienzoService.applyDelta`). Any
         * drift between client-brush byte and this palette slot silently repaints
         * strokes in the wrong color when the server-composited bitmap is fetched.
         *
         * Order matches the "Color del pincel" selector in the mockup:
         *   1=Yellow, 2=Green, 3=Blue, 4=Purple, 5=Fuchsia, 6=Black, 7=White.
         * Index 0 stays transparent for pixel fills that never draw. Index 8 is a
         * white-duplicate padding slot kept only to preserve the 9-entry array size
         * used by the compact 4bpp encoding.
         */
        val palette =
            arrayOf(
                0x00000000.toInt(), // 0: transparente
                0xFFFBC02D.toInt(), // 1: yellow  — client brush 1
                0xFF388E3C.toInt(), // 2: green   — client brush 2
                0xFF1976D2.toInt(), // 3: blue    — client brush 3
                0xFF673AB7.toInt(), // 4: purple  — client brush 4
                0xFFE91E63.toInt(), // 5: fuchsia — client brush 5
                0xFF000000.toInt(), // 6: black   — client brush 6
                0xFFFFFFFF.toInt(), // 7: white   — client brush 7
                0xFFFFFFFF.toInt(), // 8: (padding — unused index, kept for array size)
            )

        fun encodeImage(image: BufferedImage): ByteArray {
            val width = image.width
            val height = image.height
            val bytes = ByteArray((width * height + 1) / 2)

            for (y in 0 until height) {
                for (x in 0 until width) {
                    val index = y * width + x
                    val color = image.getRGB(x, y)

                    val colorIndex = findColorIndexInPalette(color)

                    val byteIndex = index / 2
                    val isHigh = index % 2 == 0

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
