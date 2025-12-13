package org.pin.backend.controller
import org.pin.backend.dto.Request.ElementoRequestDTO
import org.pin.backend.dto.Request.ListaRequestDTO
import org.pin.backend.dto.Response.ListaResponseDTO
import org.pin.backend.model.Elemento
import org.pin.backend.model.Lista
import org.pin.backend.repository.ListaRepository
import org.pin.backend.service.ListaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import java.util.*
import org.springframework.security.core.Authentication

@RestController
@RequestMapping("listas")
class ListaController(
    private val listaRepository: ListaRepository,
) {

    @Autowired
    lateinit var listaService: ListaService
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
    fun getListasByCasaId(@PathVariable casaId: Long): List<ListaResponseDTO> {
        return listaService.getListasByCasaId(casaId)
    }

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
        authentication: Authentication // Inyectamos autenticación
    ): ResponseEntity<Lista> {
        val email = authentication.name // Obtenemos el email del token
        val nuevaLista = listaService.crearLista(casaId, listaDTO, email)
        return ResponseEntity(nuevaLista, HttpStatus.CREATED)
    }

    @DeleteMapping("/{id}")
    fun borrarLista(@PathVariable id: Long): ResponseEntity<Void> {
        listaService.borrarLista(id)
        return ResponseEntity.noContent().build()
    }
}
