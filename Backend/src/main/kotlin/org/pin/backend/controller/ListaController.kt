package org.pin.backend.controller
import org.pin.backend.model.Elemento
import org.pin.backend.model.Lista
import org.pin.backend.repository.ListaRepository
import org.pin.backend.service.ListaService
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/listas")
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
}
