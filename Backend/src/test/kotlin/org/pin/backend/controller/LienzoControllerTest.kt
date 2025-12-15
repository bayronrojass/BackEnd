package org.pin.backend.controller

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.jupiter.MockitoExtension
import org.pin.backend.dto.Data.PointDeltaDTO
import org.pin.backend.model.Lienzo
import org.pin.backend.service.LienzoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import java.time.Instant

@ExtendWith(MockitoExtension::class)
class LienzoControllerTest {
    @Mock
    private lateinit var lienzoService: LienzoService

    @InjectMocks
    private lateinit var lienzoController: LienzoController

    private lateinit var lienzo: Lienzo

    @BeforeEach
    fun setUp() {
        lienzo = Lienzo(1, byteArrayOf(1, 2, 3), "png", true, 100, 100, Instant.now())
    }

    @AfterEach
    fun tearDown() {
        // No need to do anything here as we are using mocks
    }

    @Test
    fun `getById should return lienzo when found`() {
        `when`(lienzoService.findById(1)).thenReturn(lienzo)

        val result = lienzoController.getById(1)

        assert(result == lienzo)
    }

    @Test
    fun `postDeltas should return ok`() {
        val deltas = listOf(PointDeltaDTO(1f, 1f, 1f, 1))
        `when`(lienzoService.applyDelta(1, deltas)).thenReturn(ResponseEntity.ok(true))

        val result = lienzoController.postDeltas(1, deltas)

        assert(result.statusCode == HttpStatus.OK)
    }
}
