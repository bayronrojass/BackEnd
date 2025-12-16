package org.pin.backend.service

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.ArgumentMatchers.any
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.jupiter.MockitoExtension
import org.pin.backend.dto.Data.PointDeltaDTO
import org.pin.backend.model.Lienzo
import org.pin.backend.repository.LienzoRepository
import org.springframework.http.HttpStatus
import java.awt.image.BufferedImage
import java.time.Instant
import java.util.*

@ExtendWith(MockitoExtension::class)
class LienzoServiceTest {
    @Mock
    private lateinit var lienzoRepository: LienzoRepository

    @Mock
    lateinit var firebaseMessagingService: FirebaseMessagingService

    @InjectMocks
    private lateinit var lienzoService: LienzoService

    private lateinit var lienzo: Lienzo

    companion object {
        @JvmStatic
        @BeforeAll
        fun setupHeadless() {
            System.setProperty("java.awt.headless", "true")
        }
    }

    @BeforeEach
    fun setUp() {
        lienzo = Lienzo(1, byteArrayOf(1, 2, 3), "png", true, 100, 100, Instant.now())
    }

    @Test
    fun `findById should return lienzo when found`() {
        `when`(lienzoRepository.findById(1)).thenReturn(Optional.of(lienzo))

        val result = lienzoService.findById(1)

        assertNotNull(result)
        assertEquals(lienzo, result)
    }

    @Test
    fun `save should save and return lienzo`() {
        `when`(lienzoRepository.save(lienzo)).thenReturn(lienzo)

        val result = lienzoService.save(lienzo)

        assertNotNull(result)
        assertEquals(lienzo, result)
    }

    @Test
    fun `createDefault should create and save a default lienzo`() {
        `when`(lienzoRepository.save(any(Lienzo::class.java))).thenAnswer { it.arguments[0] }

        val result = lienzoService.createDefault()

        assertNotNull(result)
        assertEquals(2500, result.width)
        assertEquals(1500, result.height)
    }

    @Test
    fun `createFromImage should create and save a lienzo from an image`() {
        `when`(lienzoRepository.save(any(Lienzo::class.java))).thenAnswer { it.arguments[0] }
        val image = BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB)

        val result = lienzoService.createFromImage(image, "png")

        assertNotNull(result)
        assertEquals(100, result.width)
        assertEquals(100, result.height)
        assertEquals("png", result.format)
        assertEquals(true, result.isImage)
    }

    @Test
    fun `createDefaultPostIt should create and save a default post-it`() {
        `when`(lienzoRepository.save(any(Lienzo::class.java))).thenAnswer { it.arguments[0] }

        val result = lienzoService.createDefaultPostIt()

        assertNotNull(result)
        assertEquals(1000, result.width)
        assertEquals(1000, result.height)
    }

    @Test
    fun `applyDelta should apply deltas to a lienzo`() {
        val lienzoNoImage = Lienzo(1, ByteArray(2500 * 1500 / 2), null, false, 2500, 1500, Instant.now())
        `when`(lienzoRepository.findById(1)).thenReturn(Optional.of(lienzoNoImage))
        `when`(lienzoRepository.save(any(Lienzo::class.java))).thenAnswer { it.arguments[0] }
        val deltas = listOf(PointDeltaDTO(1f, 1f, 1f, 1))

        val result = lienzoService.applyDelta(1, deltas)

        assertEquals(HttpStatus.OK, result.statusCode)
    }
}
