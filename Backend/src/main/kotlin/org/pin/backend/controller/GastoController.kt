package org.pin.backend.controller

import org.pin.backend.dto.Response.GastoResponseDTO
import org.pin.backend.repository.CasaRepository
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import java.time.format.DateTimeFormatter

@RestController
@RequestMapping("/casas")
class GastoController(
    private val casaRepository: CasaRepository
) {

    @GetMapping("/{casaId}/gastos")
    @Transactional(readOnly = true)
    fun getGastosByCasaId(@PathVariable casaId: Long): ResponseEntity<List<GastoResponseDTO>> {
        val casa = casaRepository.findById(casaId).orElse(null)
            ?: return ResponseEntity.notFound().build()

        // Mapeamos la entidad Gasto al DTO que espera el Android
        val gastosDTO = casa.gastos.map { gasto ->
            GastoResponseDTO(
                id = gasto.id!!,
                nombre = gasto.nombre,
                descripcion = gasto.descripcion,
                importe = gasto.importe, // Ahora sí existe
                fecha = gasto.fechaInicio.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                categoria = gasto.categoria.name,
                pagadoPorNombre = gasto.pagadoPor?.nombre ?: "Desconocido" // Ahora sí existe
            )
        }
        return ResponseEntity.ok(gastosDTO)
    }
}