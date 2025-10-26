package org.pin.backend.utils

import org.pin.backend.dto.PointDeltaDTO
import java.awt.image.BufferedImage
import kotlin.math.sqrt

class Lienzo4bpp(
    val width: Short,
    val height: Short,
    val bytes: ByteArray,
) {
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

    private fun setPixel(
        x: Short,
        y: Short,
        color: Byte,
    ) {
        require(x in 0 until width && y in 0 until height)
        require(color in 0..15)

        val index = y * width + x
        val byteIndex = index / 2
        val isHigh = index % 2 == 0
        val current = bytes[byteIndex].toInt() and 0xFF

        val newByte =
            if (isHigh) {
                (current and 0x0F) or (color.toInt() shl 4)
            } else {
                (current and 0xF0) or (color.toInt() and 0x0F)
            }
        bytes[byteIndex] = newByte.toByte()
    }

    fun drawLine(
        p1: PointDeltaDTO,
        p2: PointDeltaDTO,
    ) {
        val dx = p2.x - p1.x
        val dy = p2.y - p1.y
        val distance = sqrt(((dx * dx) + (dy * dy)).toDouble())
        val steps = distance.toInt().coerceAtLeast(1)
        for (i in 0..steps) {
            val t = i / distance
            val x = p1.x + dx * t
            val y = p1.y + dy * t
            drawCircle(x.toInt(), y.toInt(), p2.size.toInt(), p2.color)
        }
    }

    private fun drawCircle(
        cx: Int,
        cy: Int,
        radius: Int,
        color: Byte,
    ) {
        for (y in (cy - radius)..(cy + radius)) {
            for (x in (cx - radius)..(cx + radius)) {
                if (x in 0 until width && y in 0 until height) {
                    val dx = x - cx
                    val dy = y - cy
                    if (dx * dx + dy * dy <= radius * radius) {
                        setPixel(x.toShort(), y.toShort(), color)
                    }
                }
            }
        }
    }

    fun toBufferedImage(): BufferedImage {
        val img = BufferedImage(width.toInt(), height.toInt(), BufferedImage.TYPE_INT_ARGB)

        for (y in 0 until height) {
            for (x in 0 until width) {
                val color = palette[getPixel(x.toShort(), y.toShort())]
                img.setRGB(x, y, color)
            }
        }
        return img
    }
}
