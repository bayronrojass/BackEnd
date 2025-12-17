package org.pin.backend.controller

import org.pin.backend.dto.Request.ElementoRequestDTO
import org.pin.backend.dto.Response.ElementoResponseDTO
import org.pin.backend.service.ElementoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class ElementoController {

    @Autowired
    lateinit var elementoService: ElementoService

    @GetMapping("/listas/{listaId}/elementos")
    fun getElementosByListaId(@PathVariable listaId: Long): ResponseEntity<List<ElementoResponseDTO>> {
        val elementos = elementoService.getElementosByListaId(listaId)
        return ResponseEntity.ok(elementos)
    }

    @PutMapping("/elementos/{id}")
    fun actualizarElemento(
        @PathVariable id: Long,
        @RequestBody request: ElementoRequestDTO
    ): ResponseEntity<ElementoResponseDTO> {
        val elementoActualizado = elementoService.actualizarElemento(id, request)
        return ResponseEntity.ok(elementoService.convertirADTO(elementoActualizado))
    }

    @DeleteMapping("/elementos/{id}")
    fun borrarElemento(@PathVariable id: Long): ResponseEntity<Void> {
        elementoService.borrarElemento(id)
        return ResponseEntity.noContent().build()
    }
}
