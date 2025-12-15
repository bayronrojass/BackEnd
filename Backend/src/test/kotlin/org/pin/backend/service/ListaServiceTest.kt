package org.pin.backend.service

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`
import org.mockito.junit.jupiter.MockitoExtension
import org.pin.backend.model.Lista
import org.pin.backend.repository.ListaRepository

@ExtendWith(MockitoExtension::class)
class ListaServiceTest {
    @Mock
    private lateinit var repo: ListaRepository

    @InjectMocks
    private lateinit var service: ListaService

    @Test
    fun `findAll should call repository and return its result`() {
        // Given: Preparamos una lista de listas que el repositorio debería devolver.
        val expectedListas =
            listOf(
                Lista(id = 1, nombre = "Lista 1"),
                Lista(id = 2, nombre = "Lista 2"),
            )

        // Configuramos el mock para que, cuando se llame a repo.findAll(), devuelva nuestra lista.
        `when`(repo.findAll()).thenReturn(expectedListas)

        // When: Ejecutamos el método que queremos probar.
        val actualListas = service.findAll()

        // Then: Verificamos que el resultado es el que esperamos.
        assertEquals(expectedListas, actualListas, "El servicio debería devolver la lista de listas del repositorio.")

        // Adicionalmente, verificamos que el método findAll() del repositorio fue llamado exactamente una vez.
        verify(repo).findAll()
    }
}
