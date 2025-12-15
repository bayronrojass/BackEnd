package org.pin.backend.controller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.jupiter.MockitoExtension
import org.pin.backend.dto.Request.TareaRequestDTO
import org.pin.backend.model.Casa
import org.pin.backend.model.Tarea
import org.pin.backend.model.Usuario
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.TareaRepository
import org.pin.backend.repository.UsuarioRepository
import org.pin.backend.service.FirebaseMessagingService
import org.pin.backend.service.TareaService
import org.springframework.http.HttpStatus
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

@ExtendWith(MockitoExtension::class)
class TareaControllerTest {
    @Mock
    private lateinit var service: TareaService

    @Mock
    private lateinit var tareaRepository: TareaRepository

    @Mock
    private lateinit var usuarioRepository: UsuarioRepository

    @Mock
    private lateinit var casaRepository: CasaRepository

    @Mock
    lateinit var firebaseMessagingService: FirebaseMessagingService

    @InjectMocks
    private lateinit var controller: TareaController

    private lateinit var tarea: Tarea
    private lateinit var usuario: Usuario

    @BeforeEach
    fun setUp() {
        usuario = Usuario(id = 1, nombre = "Test User", correo = "test@user.com", contrasena = "password")
        tarea =
            Tarea(
                id = 1L,
                nombre = "Tarea Test",
                descripcion = "Descripción de test",
                completado = false,
                fechaFin = LocalDateTime.now().plusDays(1),
                frecuencia = "Diaria",
                periodica = true,
                prioridad = "Media",
                asignadoA = usuario,
            )
    }

    @Test
    fun `getAll should return list of TareaResponseDTO`() {
        // Given
        `when`(service.findAll()).thenReturn(listOf(tarea))

        // When
        val result = controller.getAll()

        // Then
        assertNotNull(result)
        assertEquals(1, result.size)
        assertEquals(tarea.nombre, result[0].nombre)
        verify(service, times(1)).findAll()
    }

    @Test
    fun `actualizarTarea should return 404 when tarea not found`() {
        // Given
        `when`(tareaRepository.findById(anyLong())).thenReturn(Optional.empty())

        // When
        val response = controller.actualizarTarea(1L, TareaRequestDTO())

        // Then
        assertEquals(HttpStatus.NOT_FOUND, response.statusCode)
    }

    @Test
    fun `actualizarTarea should update tarea and return 200 OK`() {
        // GIVEN
        val newFechaFin = LocalDateTime.now().plusDays(5).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)

        val request =
            TareaRequestDTO(
                nombre = "Nombre Actualizado",
                descripcion = "Descripción Actualizada",
                completado = true,
                fechaFin = newFechaFin,
                frecuencia = "Semanal",
                periodica = false,
                prioridad = "Media",
                creadoPor = 1L,
                asignadoAId = 1L,
            )

        `when`(tareaRepository.findById(1L)).thenReturn(Optional.of(tarea))

        `when`(tareaRepository.save(any(Tarea::class.java))).thenAnswer { it.getArgument(0) }

        // WHEN
        val response = controller.actualizarTarea(1L, request)

        // THEN
        assertEquals(HttpStatus.OK, response.statusCode)
        val responseBody = response.body!!
        assertEquals("Nombre Actualizado", responseBody.nombre)
    }

    @Test
    fun `actualizarTarea should unassign user when asignadoAId is -1`() {
        // Given
        val request = TareaRequestDTO(asignadoAId = -1L)
        `when`(tareaRepository.findById(1L)).thenReturn(Optional.of(tarea))
        `when`(tareaRepository.save(any(Tarea::class.java))).thenAnswer { it.getArgument(0) }

        // When
        val response = controller.actualizarTarea(1L, request)

        // Then
        assertEquals(HttpStatus.OK, response.statusCode)
        assertNull(response.body!!.asignadoA)
        assertNull(tarea.asignadoA) // Verifica que el objeto original se ha modificado
    }

    @Test
    fun `actualizarTarea should assign new user`() {
        // Given
        val nuevoUsuario = Usuario(id = 2, nombre = "Nuevo Usuario", correo = "nuevo@test.com", contrasena = "pass")
        val request = TareaRequestDTO(asignadoAId = 2L)

        `when`(tareaRepository.findById(1L)).thenReturn(Optional.of(tarea))
        `when`(usuarioRepository.findById(2L)).thenReturn(Optional.of(nuevoUsuario))
        `when`(tareaRepository.save(any(Tarea::class.java))).thenAnswer { it.getArgument(0) }

        // When
        val response = controller.actualizarTarea(1L, request)

        // Then
        assertEquals(HttpStatus.OK, response.statusCode)
        assertEquals(2L, response.body!!.asignadoA?.id)
        assertEquals(nuevoUsuario, tarea.asignadoA)
    }

    @Test
    fun `borrarTarea should return 404 when tarea not found`() {
        // Given
        `when`(tareaRepository.findById(anyLong())).thenReturn(Optional.empty())

        // When
        val response = controller.borrarTarea(1L)

        // Then
        assertEquals(HttpStatus.NOT_FOUND, response.statusCode)
    }

    @Test
    fun `borrarTarea should remove tarea from casa when associated`() {
        // GIVEN
        val casa =
            Casa(
                id = 1,
                nombre = "Mi Casa",
                listas = mutableListOf(),
                fechaCreacion = LocalDateTime.now(),
            )
        tarea.casa = casa
        casa.tareas.add(tarea)

        `when`(tareaRepository.findById(1L)).thenReturn(Optional.of(tarea))

        // Mockito.`when`(casaRepository.save(any(Casa::class.java))).thenReturn(casa)

        doNothing().`when`(tareaRepository).delete(tarea)

        // WHEN
        val response = controller.borrarTarea(1L)

        // THEN
        assertEquals(HttpStatus.NO_CONTENT, response.statusCode)

        verify(tareaRepository).delete(tarea)
    }

    @Test
    fun `borrarTarea should delete tarea directly when not associated with a casa`() {
        // Given
        `when`(tareaRepository.findById(1L)).thenReturn(Optional.of(tarea))
        `when`(casaRepository.findByTareasContains(tarea)).thenReturn(Optional.empty())

        // When
        val response = controller.borrarTarea(1L)

        // Then
        assertEquals(HttpStatus.NO_CONTENT, response.statusCode)
        verify(tareaRepository, times(1)).delete(tarea)
        verify(casaRepository, never()).save(any(Casa::class.java))
    }
}
