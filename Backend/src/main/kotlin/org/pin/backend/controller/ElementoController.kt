package org.pin.backend.controller
import org.pin.backend.dto.ElementoRequestDTO
import org.pin.backend.dto.ElementoResponseDTO
import org.pin.backend.model.Elemento
import org.pin.backend.model.Item
import org.pin.backend.model.Lista
import org.pin.backend.repository.ElementoRepository
import org.pin.backend.repository.ItemRepository
import org.pin.backend.repository.ListaRepository
import org.pin.backend.service.ElementoService
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import java.util.Optional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/elementos")
class ElementoController(
    private val service: ElementoService,
    private val elementoRepository: ElementoRepository,
    private val itemRepository: ItemRepository,
    private val listaRepository: ListaRepository
) {
    @GetMapping
    fun getAll() = service.findAll()

    @PutMapping("/{elementoId}")
    @Transactional
    fun actualizarElemento(
        @PathVariable elementoId: Long,
        @RequestBody request: ElementoRequestDTO
    ): ResponseEntity<ElementoResponseDTO> {
        // Buscamos en el repositorio base de Elemento
        val elementoOptional: Optional<Elemento> = elementoRepository.findById(elementoId)
        if (elementoOptional.isEmpty) {
            return ResponseEntity.notFound().build()
        }

        val elemento = elementoOptional.get()

        // Actualiza solo los campos que no sean nulos en el request
        request.nombre?.let { elemento.nombre = it }
        request.descripcion?.let { elemento.descripcion = it }
        request.completado?.let { elemento.completado = it } // <-- Esto marcará como completado

        val elementoActualizado = elementoRepository.save(elemento)

        val responseDTO = ElementoResponseDTO(
            id = elementoActualizado.id!!,
            nombre = elementoActualizado.nombre,
            descripcion = elementoActualizado.descripcion,
            completado = elementoActualizado.completado
        )
        return ResponseEntity.ok(responseDTO)
    }

    @DeleteMapping("/{elementoId}")
    @Transactional
    fun borrarElemento(@PathVariable elementoId: Long): ResponseEntity<Void> {
        val elementoOptional: Optional<Elemento> = elementoRepository.findById(elementoId)
        if (elementoOptional.isEmpty) {
            return ResponseEntity.notFound().build()
        }
        val elemento = elementoOptional.get()

        // Debemos comprobar si es un Item para poder desvincularlo de la Lista
            val listaOptional: Optional<Lista> = listaRepository.findByElementosContains(elemento)
            if (listaOptional.isPresent) {
                val lista = listaOptional.get()
                lista.elementos.remove(elemento) // Quita el Item de la Lista
                listaRepository.save(lista)
                // orphanRemoval=true en Lista.kt se encarga de borrar el Item
            }

        return ResponseEntity.noContent().build()
    }
}
