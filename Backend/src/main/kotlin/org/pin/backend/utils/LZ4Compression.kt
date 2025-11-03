package org.pin.backend.utils
import net.jpountz.lz4.LZ4Compressor
import net.jpountz.lz4.LZ4Factory
import net.jpountz.lz4.LZ4FastDecompressor

object LZ4Compression {
    private val factory = LZ4Factory.safeInstance()
    private val compressor: LZ4Compressor = factory.highCompressor()
    private val decompressor: LZ4FastDecompressor = factory.fastDecompressor()

    private const val LZ4_MAGIC = 0x4C5A3434

    fun compress(data: ByteArray): ByteArray {
        if (data.isEmpty()) {
            return data
        }

        val maxCompressedLength = compressor.maxCompressedLength(data.size)
        val compressed = ByteArray(maxCompressedLength + 8)

        writeInt(compressed, 0, LZ4_MAGIC)
        writeInt(compressed, 4, data.size)

        val compressedLength = compressor.compress(data, 0, data.size, compressed, 8, maxCompressedLength)

        if (compressedLength <= 0) {
            throw IllegalStateException("Compresión falló - longitud resultante: $compressedLength")
        }

        val result = compressed.copyOf(8 + compressedLength)

        return result
    }

    fun decompress(data: ByteArray): ByteArray {
        if (!isCompressed(data)) {
            return data
        }

        val originalSize = readInt(data, 4)
        val decompressed = ByteArray(originalSize)
        decompressor.decompress(data, 8, decompressed, 0, originalSize)

        return decompressed
    }

    fun isCompressed(data: ByteArray): Boolean {
        if (data.size < 8) return false
        return readInt(data, 0) == LZ4_MAGIC
    }

    private fun writeInt(
        array: ByteArray,
        offset: Int,
        value: Int,
    ) {
        array[offset] = (value ushr 24).toByte()
        array[offset + 1] = (value ushr 16).toByte()
        array[offset + 2] = (value ushr 8).toByte()
        array[offset + 3] = value.toByte()
    }

    private fun readInt(
        array: ByteArray,
        offset: Int,
    ): Int =
        ((array[offset].toInt() and 0xFF) shl 24) or
            ((array[offset + 1].toInt() and 0xFF) shl 16) or
            ((array[offset + 2].toInt() and 0xFF) shl 8) or
            (array[offset + 3].toInt() and 0xFF)
}
