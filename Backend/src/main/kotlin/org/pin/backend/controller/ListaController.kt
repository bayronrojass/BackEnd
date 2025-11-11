package org.pin.backend.controller
import org.pin.backend.dto.Request.ElementoRequestDTO
import org.pin.backend.model.Casa
import org.pin.backend.model.Elemento
import org.pin.backend.model.Lista
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.ListaRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("listas")
class ListaController(
    private val listaRepository: ListaRepository,
    private val casaRepository: CasaRepository,
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

    @DeleteMapping("/{listaId}")
    @Transactional
    fun borrarLista(
        @PathVariable listaId: Long,
    ): ResponseEntity<Void> {
        val listaOptional: Optional<Lista> = listaRepository.findById(listaId)
        if (listaOptional.isEmpty) {
            return ResponseEntity.notFound().build() // 404 si la lista no existe
        }

        val lista = listaOptional.get()

        // 1. Encontrar la Casa dueña de esta lista
        val casaOptional: Optional<Casa> = casaRepository.findByListasContains(lista)

        if (casaOptional.isPresent) {
            // 2. Quitar la lista de la colección de la Casa
            val casa = casaOptional.get()
            casa.listas.remove(lista)
            casaRepository.save(casa) // 3. Guardar la Casa
        } else {
            // Si ninguna Casa la posee (lista huérfana), la borramos directamente
            listaRepository.delete(lista)
        }

        return ResponseEntity.noContent().build() // HTTP 204 (Éxito, sin contenido)
    }
}
