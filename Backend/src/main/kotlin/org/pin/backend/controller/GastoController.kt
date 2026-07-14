package org.pin.backend.controller

import org.pin.backend.dto.Data.BorradorGastoDTO
import org.pin.backend.dto.Request.GastoRequestDTO
import org.pin.backend.dto.Response.GastoResponseDTO
import org.pin.backend.repository.CasaRepository
import org.pin.backend.security.CasaMembershipValidator
import org.pin.backend.service.GastoIAService
import org.pin.backend.service.GastoService
import org.pin.backend.service.PdfService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/casas")
class GastoController(
    private val gastoService: GastoService,
    private val gastoIAService: GastoIAService,
    private val casaRepository: CasaRepository,
    private val pdfService: PdfService,
    private val membershipValidator: CasaMembershipValidator,
) {
    @GetMapping("/{casaId}/gastos")
    @Transactional(readOnly = true)
    fun getGastosByCasaId(
        @PathVariable casaId: Long,
        @PageableDefault(size = 20, sort = ["fechaInicio"], direction = Sort.Direction.DESC)
        pageable: Pageable,
    ): ResponseEntity<Page<GastoResponseDTO>> {
        membershipValidator.validateMembership(casaId)
        return ResponseEntity.ok(gastoService.getGastosByCasaId(casaId, pageable))
    }

    @PostMapping("/{casaId}/crearGasto")
    @Transactional
    fun createGasto(
        @PathVariable casaId: Long,
        @RequestBody request: GastoRequestDTO,
    ): ResponseEntity<String> {
        membershipValidator.validateMembership(casaId)
        if (!gastoService.crearGasto(casaId, request)) {
            return ResponseEntity.notFound().build()
        }
        return ResponseEntity.ok("Gasto creado correctamente")
    }

    @PutMapping("/{casaId}/gastos/{gastoId}")
    @Transactional
    fun editarGasto(
        @PathVariable casaId: Long,
        @PathVariable gastoId: Long,
        @RequestBody request: GastoRequestDTO,
    ): ResponseEntity<Void> {
        membershipValidator.validateMembership(casaId)
        if (!gastoService.editarGasto(casaId, gastoId, request)) {
            return ResponseEntity.notFound().build()
        }
        return ResponseEntity.ok().build()
    }

    @PostMapping("/escanear-ticket")
    fun escanearTicket(
        @RequestParam("file") file: MultipartFile,
    ): ResponseEntity<BorradorGastoDTO> {
        val borrador = gastoIAService.processarTicket(file)
        return ResponseEntity.ok(borrador)
    }

    @PostMapping("/{casaId}/gastos/{gastoId}/foto")
    @Transactional
    fun actualizarFotoTicket(
        @PathVariable casaId: Long,
        @PathVariable gastoId: Long,
        @RequestParam("file") file: MultipartFile,
    ): ResponseEntity<String> {
        membershipValidator.validateMembership(casaId)
        val url =
            gastoService.actualizarFotoTicket(casaId, gastoId, file)
                ?: return ResponseEntity.notFound().build()
        return ResponseEntity.ok(url)
    }

    @DeleteMapping("/{casaId}/gastos/{gastoId}/foto")
    @Transactional
    fun eliminarFotoTicket(
        @PathVariable casaId: Long,
        @PathVariable gastoId: Long,
    ): ResponseEntity<Void> {
        membershipValidator.validateMembership(casaId)
        if (!gastoService.eliminarFotoTicket(casaId, gastoId)) {
            return ResponseEntity.notFound().build()
        }
        return ResponseEntity.ok().build()
    }

    @GetMapping("/{casaId}/gastos/pdf")
    @Transactional(readOnly = true)
    fun descargarPdfGastos(
        @PathVariable casaId: Long,
    ): ResponseEntity<ByteArray> {
        membershipValidator.validateMembership(casaId)
        val casa =
            casaRepository.findByIdWithGastos(casaId)
                ?: return ResponseEntity.notFound().build()

        val pdfBytes = pdfService.generarResumenGastosPdf(casa)

        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_PDF
        headers.setContentDispositionFormData("attachment", "Resumen_Gastos_${casa.nombre}.pdf")

        return ResponseEntity.ok().headers(headers).body(pdfBytes)
    }
}
