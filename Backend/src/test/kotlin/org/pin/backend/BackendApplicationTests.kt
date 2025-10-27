package org.pin.backend

import org.junit.jupiter.api.Test
import org.pin.backend.utils.LZ4Compression
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BackendApplicationTests {
    @Test
    fun contextLoads() {
    }

    @Test
    fun testCompression() {
        val testData = "Hello World! This is a test string for LZ4 compression.".toByteArray()

        println("Original size: ${testData.size} bytes")

        val compressed = LZ4Compression.compress(testData)
        println("Compressed size: ${compressed.size} bytes")

        val decompressed = LZ4Compression.decompress(compressed)
        println("Decompressed size: ${decompressed.size} bytes")

        val isEqual = testData.contentEquals(decompressed)
        println("Data integrity: $isEqual")

        if (!isEqual) {
            println("Original: ${String(testData)}")
            println("Decompressed: ${String(decompressed)}")
        }
    }
}
