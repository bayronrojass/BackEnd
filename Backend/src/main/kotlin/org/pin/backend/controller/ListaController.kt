package org.pin.backend.controller
import org.pin.backend.dto.Data.toDTO
import org.pin.backend.dto.Request.ElementoRequestDTO
import org.pin.backend.dto.Request.ListaRequestDTO
import org.pin.backend.dto.Response.ListaResponseDTO
import org.pin.backend.model.Elemento
import org.pin.backend.repository.ListaRepository
import org.pin.backend.repository.UsuarioRepository
import org.pin.backend.security.CasaMembershipValidator
import org.pin.backend.service.ElementoService
import org.pin.backend.service.ListaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("listas")
class ListaController(
    private val listaRepository: ListaRepository,
    private var listaService: ListaService,
    private var usuarioRepository: UsuarioRepository,
    private val membershipValidator: CasaMembershipValidator,
) {
    @Autowired
    lateinit var elementoService: ElementoService

    @GetMapping
    fun getAll() = listaRepository.findAll()

    @GetMapping("/casa/{casaId}")
    fun getListasByCasaId(
        @PathVariable casaId: Long,
    ): List<ListaResponseDTO> {
        membershipValidator.validateMembership(casaId)
        return listaService.getListasByCasaId(casaId)
    }

    @PostMapping("/{listaId}/elementos")
    fun crearElementoEnLista(
        @PathVariable listaId: Long,
        @RequestBody request: ElementoRequestDTO,
    ): ResponseEntity<Elemento> {
        // Usamos el servicio que SÍ sabe guardar cantidad y lista_id correctamente
        try {
            val nuevoElemento = elementoService.crearElemento(listaId, request)
            return ResponseEntity.status(HttpStatus.CREATED).body(nuevoElemento)
        } catch (e: Exception) {
            return ResponseEntity.notFound().build()
        }
    }

    @PostMapping("/casa/{casaId}")
    fun crearLista(
        @PathVariable casaId: Long,
        @RequestBody listaDTO: ListaRequestDTO,
    ): ResponseEntity<ListaResponseDTO> {
        membershipValidator.validateMembership(casaId)
        val propietario =
            usuarioRepository
                .findById(listaDTO.propietarioId)
                .orElseThrow { RuntimeException("Usuario no encontrado") }

        // 2. Llamamos al servicio pasando el EMAIL del usuario encontrado
        val nuevaLista = listaService.crearLista(casaId, listaDTO, propietario.correo)

        // 3. Convertimos a DTO y devolvemos
        val responseDTO =
            ListaResponseDTO(
                id = nuevaLista.id ?: 0,
                nombre = nuevaLista.nombre,
                descripcion = nuevaLista.descripcion,
                fechaCreacion = nuevaLista.fechaCreacion.toString(),
                fechaEdicion = nuevaLista.fechaEdicion?.toString(),
                propietario = nuevaLista.propietario?.toDTO(),
                participantes = nuevaLista.participantes.map { it.toDTO() },
            )

        return ResponseEntity(responseDTO, HttpStatus.CREATED)
    }

    @DeleteMapping("/{id}")
    fun borrarLista(
        @PathVariable id: Long,
    ): ResponseEntity<Void> {
        try {
            listaService.borrarLista(id)
            return ResponseEntity.noContent().build()
        } catch (e: Exception) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build()
        }
    }
}
