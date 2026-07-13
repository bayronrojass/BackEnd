package org.pin.backend.controller

import org.pin.backend.dto.Request.TareaRequestDTO
import org.pin.backend.dto.Response.TareaResponseDTO
import org.pin.backend.security.CasaMembershipValidator
import org.pin.backend.service.TareaService
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("tareas")
class TareaController(
    private val tareaService: TareaService,
    private val membershipValidator: CasaMembershipValidator,
) {
    @GetMapping
    fun getAll() = tareaService.findAll()

    @PutMapping("/{tareaId}")
    @Transactional
    fun actualizarTarea(
        @PathVariable tareaId: Long,
        @RequestBody request: TareaRequestDTO,
    ): ResponseEntity<TareaResponseDTO> {
        val response =
            tareaService.actualizarTarea(tareaId, request)
                ?: return ResponseEntity.notFound().build()
        return ResponseEntity.ok(response)
    }

    @DeleteMapping("/{tareaId}")
    @Transactional
    fun borrarTarea(
        @PathVariable tareaId: Long,
    ): ResponseEntity<Void> {
        if (!tareaService.borrarTarea(tareaId)) {
            return ResponseEntity.notFound().build()
        }
        return ResponseEntity.noContent().build()
    }

    @PutMapping("/{tareaId}/notify")
    @Transactional
    fun notificarTarea(
        @PathVariable tareaId: Long,
    ): ResponseEntity<Void> {
        if (!tareaService.notificarTarea(tareaId)) {
            return ResponseEntity.badRequest().build()
        }
        return ResponseEntity.ok().build()
    }

    @PostMapping("/{tareaId}/votar")
    @Transactional
    fun votarTarea(
        @PathVariable tareaId: Long,
        @RequestParam usuarioId: Long,
        @RequestParam puntuacion: Int,
    ): ResponseEntity<Void> {
        if (!tareaService.votarTarea(tareaId, usuarioId, puntuacion)) {
            return ResponseEntity.notFound().build()
        }
        return ResponseEntity.ok().build()
    }

    @PostMapping("/repartir/casa/{casaId}")
    @Transactional
    fun ejecutarRepartoInteligente(
        @PathVariable casaId: Long,
    ): ResponseEntity<String> {
        membershipValidator.validateMembership(casaId)
        val result = tareaService.ejecutarRepartoInteligente(casaId)
        if (result != "OK") {
            return ResponseEntity.badRequest().body(result)
        }
        return ResponseEntity.ok("Tareas repartidas con éxito según las preferencias.")
    }

    @PutMapping("/{tareaId}/completar")
    @Transactional
    fun completarTarea(
        @PathVariable tareaId: Long,
    ): ResponseEntity<TareaResponseDTO> {
        val response =
            tareaService.completarTarea(tareaId)
                ?: return ResponseEntity.notFound().build()
        return ResponseEntity.ok(response)
    }
}
