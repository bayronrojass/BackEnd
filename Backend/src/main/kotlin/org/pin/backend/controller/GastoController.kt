package org.pin.backend.controller

import org.pin.backend.dto.Request.GastoRequestDTO
import org.pin.backend.dto.Response.GastoResponseDTO
import org.pin.backend.model.Gasto
import org.pin.backend.model.enums.CategoriaGasto
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.UsuarioRepository
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RestController
@RequestMapping("/casas")
class GastoController(
    private val casaRepository: CasaRepository,
    private val usuarioRepository: UsuarioRepository
) {

    @GetMapping("/{casaId}/gastos")
    @Transactional(readOnly = true)
    fun getGastosByCasaId(@PathVariable casaId: Long): ResponseEntity<List<GastoResponseDTO>> {
        val casa = casaRepository.findById(casaId).orElse(null)
            ?: return ResponseEntity.notFound().build()

        val gastosDTO = casa.gastos.map { gasto ->
            GastoResponseDTO(
                id = gasto.id!!,
                nombre = gasto.nombre,
                descripcion = gasto.descripcion,
                importe = gasto.importe,
                fecha = gasto.fechaInicio.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                categoria = gasto.categoria.name,
                pagadoPorNombre = gasto.pagadoPor?.nombre ?: "Desconocido"
            )
        }
        return ResponseEntity.ok(gastosDTO)
    }

    @PostMapping("/{casaId}/crearGasto")
    @Transactional
    fun createGasto(
        @PathVariable casaId: Long,
        @RequestBody request: GastoRequestDTO
    ): ResponseEntity<String> {
        val casa = casaRepository.findById(casaId).orElse(null)
            ?: return ResponseEntity.notFound().build()

        val usuarioPaga = usuarioRepository.findById(request.pagadoPorId).orElse(null)

        val nuevoGasto = Gasto(
            nombre = request.nombre,
            descripcion = request.descripcion,
            importe = request.importe,
            fechaInicio = LocalDateTime.now(),
            categoria = try {
                CategoriaGasto.valueOf(request.categoria)
            } catch (e: Exception) {
                CategoriaGasto.OTROS
            },
            pagadoPor = usuarioPaga
        )

        casa.gastos.add(nuevoGasto)
        casaRepository.save(casa)

        return ResponseEntity.ok("Gasto creado correctamente")
    }
}