package org.pin.backend.service

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`
import org.mockito.junit.jupiter.MockitoExtension
import org.pin.backend.model.Tarea
import org.pin.backend.repository.TareaRepository

@ExtendWith(MockitoExtension::class)
class TareaServiceTest {
    @Mock
    private lateinit var repo: TareaRepository

    @InjectMocks
    private lateinit var service: TareaService

    @Mock
    lateinit var firebaseMessagingService: FirebaseMessagingService

    @Test
    fun `findAll should call repository and return its result`() {
        // Given: Preparamos una lista de tareas que el repositorio debería devolver.
        val expectedTareas =
            listOf(
                Tarea(id = 1, nombre = "Tarea 1", completado = false),
                Tarea(id = 2, nombre = "Tarea 2", completado = true),
            )

        // Configuramos el mock para que, cuando se llame a repo.findAll(), devuelva nuestra lista.
        `when`(repo.findAll()).thenReturn(expectedTareas)

        // When: Ejecutamos el método que queremos probar.
        val actualTareas = service.findAll()

        // Then: Verificamos que el resultado es el que esperamos.
        assertEquals(expectedTareas, actualTareas, "El servicio debería devolver la lista de tareas del repositorio.")

        // Adicionalmente, verificamos que el método findAll() del repositorio fue llamado exactamente una vez.
        verify(repo).findAll()
    }
}
