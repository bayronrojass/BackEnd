package org.pin.backend.controller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.jupiter.MockitoExtension
import org.pin.backend.dto.Request.ElementoRequestDTO
import org.pin.backend.model.Casa
import org.pin.backend.model.Elemento
import org.pin.backend.model.Lienzo
import org.pin.backend.model.Lista
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.ListaRepository
import org.springframework.http.HttpStatus
import java.time.Instant
import java.time.LocalDateTime
import java.util.*

@ExtendWith(MockitoExtension::class)
class ListaControllerTest {
    @Mock
    private lateinit var listaRepository: ListaRepository

    @Mock
    private lateinit var casaRepository: CasaRepository

    @InjectMocks
    private lateinit var controller: ListaController

    private lateinit var lista: Lista
    private lateinit var elemento: Elemento

    @BeforeEach
    fun setUp() {
        elemento = Elemento(id = 1, nombre = "Leche", descripcion = "Desnatada")
        lista = Lista(id = 1L, nombre = "Compra", elementos = mutableListOf(elemento))
    }

    @Test
    fun `getAll should return all lists from repository`() {
        // Given
        `when`(listaRepository.findAll()).thenReturn(listOf(lista))

        // When
        val result = controller.getAll()

        // Then
        assertNotNull(result)
        assertEquals(1, result.size)
        verify(listaRepository).findAll()
    }

    @Test
    fun `getElementosByListaId should return elements when list exists`() {
        // Given
        `when`(listaRepository.findById(1L)).thenReturn(Optional.of(lista))

        // When
        val response = controller.getElementosByListaId(1L)

        // Then
        assertEquals(HttpStatus.OK, response.statusCode)
        assertEquals(1, response.body?.size)
        assertEquals("Leche", response.body?.first()?.nombre)
    }

    @Test
    fun `getElementosByListaId should return 404 when list does not exist`() {
        // Given
        `when`(listaRepository.findById(1L)).thenReturn(Optional.empty())

        // When
        val response = controller.getElementosByListaId(1L)

        // Then
        assertEquals(HttpStatus.NOT_FOUND, response.statusCode)
    }

    @Test
    fun `crearElementoEnLista should add element and return 201 when list exists`() {
        // Given
        val request = ElementoRequestDTO(nombre = "Pan", descripcion = "Integral", completado = false)
        `when`(listaRepository.findById(1L)).thenReturn(Optional.of(lista))

        // When
        val response = controller.crearElementoEnLista(1L, request)

        // Then
        assertEquals(HttpStatus.CREATED, response.statusCode)
        assertEquals("Pan", response.body?.nombre)
        assertEquals(2, lista.elementos.size) // Verifica que se añadió a la lista original
        verify(listaRepository).save(lista)
    }

    @Test
    fun `crearElementoEnLista should return 404 when list does not exist`() {
        // Given
        val request = ElementoRequestDTO(nombre = "Pan", descripcion = "Integral", completado = false)
        `when`(listaRepository.findById(1L)).thenReturn(Optional.empty())

        // When
        val response = controller.crearElementoEnLista(1L, request)

        // Then
        assertEquals(HttpStatus.NOT_FOUND, response.statusCode)
    }

    @Test
    fun `borrarLista should return 404 when list does not exist`() {
        // Given
        `when`(listaRepository.findById(1L)).thenReturn(Optional.empty())

        // When
        val response = controller.borrarLista(1L)

        // Then
        assertEquals(HttpStatus.NOT_FOUND, response.statusCode)
    }

    @Test
    fun `borrarLista should remove list from casa when it is associated`() {
        // Given
        val casa =
            Casa(
                id = 1,
                nombre = "Mi Casa",
                listas = mutableListOf(lista),
                lienzo = Lienzo(bytes = ByteArray(0), width = 100, height = 100, lastEdited = Instant.now()),
                fechaCreacion = LocalDateTime.now(),
            )
        `when`(listaRepository.findById(1L)).thenReturn(Optional.of(lista))
        `when`(casaRepository.findByListasContains(lista)).thenReturn(Optional.of(casa))

        // When
        val response = controller.borrarLista(1L)

        // Then
        assertEquals(HttpStatus.NO_CONTENT, response.statusCode)
        assertFalse(casa.listas.contains(lista)) // La lista se elimina de la casa
        verify(casaRepository).save(casa) // Se guarda la casa para persistir el cambio
        verify(listaRepository, never()).delete(any()) // No se debe llamar al delete de listaRepository
    }

    @Test
    fun `borrarLista should delete list directly when it is an orphan`() {
        // Given
        `when`(listaRepository.findById(1L)).thenReturn(Optional.of(lista))
        `when`(casaRepository.findByListasContains(lista)).thenReturn(Optional.empty()) // No se encuentra casa

        // When
        val response = controller.borrarLista(1L)

        // Then
        assertEquals(HttpStatus.NO_CONTENT, response.statusCode)
        verify(listaRepository).delete(lista) // Se llama directamente al delete de lista
        verify(casaRepository, never()).save(any()) // No se guarda ninguna casa
    }
}
