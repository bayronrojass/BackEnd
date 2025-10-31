package org.pin.backend.controller
import org.pin.backend.dto.ElementoRequestDTO
import org.pin.backend.model.Elemento
import org.pin.backend.model.Lista
import org.pin.backend.repository.ListaRepository
import org.pin.backend.service.ListaService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("api/listas")
class ListaController(
    private val listaRepository: ListaRepository,
) {
    @GetMapping
    fun getAll() = listaRepository.findAll()

    @GetMapping("/{listaId}/elementos")
    @Transactional(readOnly = true)
    fun getElementosByListaId(@PathVariable listaId: Long): ResponseEntity<List<Elemento>> {
        val listaOptional: Optional<Lista> = listaRepository.findById(listaId)
        return if (listaOptional.isPresent) {
            val lista = listaOptional.get()
            // Accedemos a lista.elementos DENTRO de la transacción
            ResponseEntity.ok(lista.elementos.toList()) // Devuelve la lista de elementos
        } else {
            ResponseEntity.notFound().build() // Devuelve 404 si la lista no existe
        }
    }

    @PostMapping("/{listaId}/elementos")
    @Transactional
    fun crearElementoEnLista(
        @PathVariable listaId: Long,
        @RequestBody request: ElementoRequestDTO
    ): ResponseEntity<Elemento> {
        val listaOptional: Optional<Lista> = listaRepository.findById(listaId)
        if (listaOptional.isEmpty) {
            return ResponseEntity.notFound().build()
        }
        val lista = listaOptional.get()

        val nuevoElemento = Elemento(
            nombre = request.nombre,
            descripcion = request.descripcion,
            completado = request.completado ?: false
        )

        lista.elementos.add(nuevoElemento)
        listaRepository.save(lista)

        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoElemento)
    }
}
