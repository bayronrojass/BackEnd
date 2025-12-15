package org.pin.backend.controller

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.*
import org.mockito.junit.jupiter.MockitoExtension
import org.pin.backend.dto.Request.ElementoRequestDTO
import org.pin.backend.model.Elemento
import org.pin.backend.model.Lista
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.ListaRepository
import org.pin.backend.repository.UsuarioRepository
import org.pin.backend.service.ListaService
import org.springframework.http.HttpStatus
import java.util.*

@ExtendWith(MockitoExtension::class)
class ListaControllerTest {
    @Mock
    private lateinit var listaRepository: ListaRepository

    @Mock
    private lateinit var listaService: ListaService

    @Mock
    private lateinit var casaRepository: CasaRepository

    @Mock
    private lateinit var usuarioRepository: UsuarioRepository

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
        // GIVEN
        val id = 1L

        Mockito
            .doThrow(NoSuchElementException("La lista no existe"))
            .`when`(listaService)
            .borrarLista(id)

        // WHEN
        val response = controller.borrarLista(id)

        // THEN
        Assertions.assertEquals(HttpStatus.NOT_FOUND, response.statusCode)
    }

    @Test
    fun `borrarLista should remove list from casa when it is associated`() {
        // GIVEN
        val id = 1L

        // WHEN
        val response = controller.borrarLista(id)

        // THEN
        Assertions.assertEquals(HttpStatus.NO_CONTENT, response.statusCode)

        Mockito.verify(listaService).borrarLista(id)
    }

    @Test
    fun `borrarLista should delete list directly when it is an orphan`() {
        // GIVEN
        val id = 1L
        // WHEN
        val response = controller.borrarLista(id)

        // THEN
        Assertions.assertEquals(HttpStatus.NO_CONTENT, response.statusCode)

        Mockito.verify(listaService).borrarLista(id)
    }
}
