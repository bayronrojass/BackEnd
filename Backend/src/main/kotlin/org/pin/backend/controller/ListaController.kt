package org.pin.backend.controller
import org.pin.backend.dto.Data.toDTO
import org.pin.backend.dto.Request.ElementoRequestDTO
import org.pin.backend.dto.Request.ListaRequestDTO
import org.pin.backend.dto.Response.ListaResponseDTO
import org.pin.backend.model.Elemento
import org.pin.backend.model.Lista
import org.pin.backend.repository.ListaRepository
import org.pin.backend.repository.UsuarioRepository
import org.pin.backend.service.ListaService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("listas")
class ListaController(
    private val listaRepository: ListaRepository,
    private var listaService: ListaService,
    private var usuarioRepository: UsuarioRepository,
) {
    @GetMapping
    fun getAll() = listaRepository.findAll()

    @GetMapping("/{listaId}/elementos")
    @Transactional(readOnly = true)
    fun getElementosByListaId(
        @PathVariable listaId: Long,
    ): ResponseEntity<List<Elemento>> {
        val listaOptional: Optional<Lista> = listaRepository.findById(listaId)
        return if (listaOptional.isPresent) {
            val lista = listaOptional.get()
            // Accedemos a lista.elementos DENTRO de la transacción
            ResponseEntity.ok(lista.elementos.toList()) // Devuelve la lista de elementos
        } else {
            ResponseEntity.notFound().build() // Devuelve 404 si la lista no existe
        }
    }

    @GetMapping("/casa/{casaId}")
    fun getListasByCasaId(
        @PathVariable casaId: Long,
    ): List<ListaResponseDTO> = listaService.getListasByCasaId(casaId)

    @PostMapping("/{listaId}/elementos")
    @Transactional
    fun crearElementoEnLista(
        @PathVariable listaId: Long,
        @RequestBody request: ElementoRequestDTO,
    ): ResponseEntity<Elemento> {
        val listaOptional: Optional<Lista> = listaRepository.findById(listaId)
        if (listaOptional.isEmpty) {
            return ResponseEntity.notFound().build()
        }
        val lista = listaOptional.get()

        val nuevoElemento =
            Elemento(
                nombre = request.nombre,
                descripcion = request.descripcion,
                completado = request.completado ?: false,
            )

        lista.elementos.add(nuevoElemento)
        listaRepository.save(lista)

        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoElemento)
    }

    @PostMapping("/casa/{casaId}")
    fun crearLista(
        @PathVariable casaId: Long,
        @RequestBody listaDTO: ListaRequestDTO,
    ): ResponseEntity<ListaResponseDTO> {
        // 1. Buscamos al dueño por el ID que nos manda la app (sin seguridad)
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
        }
        catch (e: Exception){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build()
        }
    }
}
