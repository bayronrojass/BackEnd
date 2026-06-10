package org.pin.backend.controller

import org.pin.backend.dto.Data.BorradorGastoDTO
import org.pin.backend.dto.Request.GastoRequestDTO
import org.pin.backend.dto.Response.GastoResponseDTO
import org.pin.backend.model.Gasto
import org.pin.backend.model.enums.CategoriaGasto
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.UsuarioRepository
import org.pin.backend.service.FileStorageService
import org.pin.backend.service.GastoIAService
import org.pin.backend.service.LogroService
import org.pin.backend.service.PdfService
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import org.springframework.http.HttpHeaders

@RestController
@RequestMapping("/casas")
class GastoController(
    private val casaRepository: CasaRepository,
    private val usuarioRepository: UsuarioRepository,
    private val gastoIAService: GastoIAService,
    private val fileStorageService: FileStorageService,
    private val logroService: LogroService,
    private val pdfService: PdfService
) {
    @GetMapping("/{casaId}/gastos")
    @Transactional(readOnly = true)
    fun getGastosByCasaId(
        @PathVariable casaId: Long,
    ): ResponseEntity<List<GastoResponseDTO>> {
        val casa =
            casaRepository.findById(casaId).orElse(null)
                ?: return ResponseEntity.notFound().build()

        val gastosDTO =
            casa.gastos.map { gasto ->
                GastoResponseDTO(
                    id = gasto.id!!,
                    nombre = gasto.nombre,
                    descripcion = gasto.descripcion,
                    importe = gasto.importe,
                    fecha = gasto.fechaInicio.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                    categoria = gasto.categoria.name,
                    pagadoPorNombre = gasto.pagadoPor?.nombre ?: "Desconocido",
                    beneficiarios = gasto.beneficiarios.toMutableList(),
                    fotoTicketUrl = gasto.fotoTicketUrl
                )
            }
        return ResponseEntity.ok(gastosDTO)
    }

    @PostMapping("/{casaId}/crearGasto")
    @Transactional
    fun createGasto(
        @PathVariable casaId: Long,
        @RequestBody request: GastoRequestDTO,
    ): ResponseEntity<String> {
        val casa =
            casaRepository.findById(casaId).orElse(null)
                ?: return ResponseEntity.notFound().build()

        val usuarioPaga = usuarioRepository.findById(request.pagadoPorId).orElse(null)

        val nuevoGasto =
            Gasto(
                nombre = request.nombre,
                descripcion = request.descripcion,
                importe = request.importe,
                fechaInicio = LocalDateTime.now(),
                categoria =
                    try {
                        CategoriaGasto.valueOf(request.categoria)
                    } catch (e: Exception) {
                        CategoriaGasto.OTROS
                    },
                pagadoPor = usuarioPaga,
                beneficiarios = request.beneficiarios?.toMutableList() ?: mutableListOf(),
                fotoTicketUrl = request.urlTicket
            )

        casa.gastos.add(nuevoGasto)
        casaRepository.save(casa)

        val usadoIA = !request.urlTicket.isNullOrBlank()
        logroService.procesarGastoCreado(request.pagadoPorId, usadoIA)

        return ResponseEntity.ok("Gasto creado correctamente")
    }


    @PutMapping("/{casaId}/gastos/{gastoId}")
    @Transactional
    fun editarGasto(
        @PathVariable casaId: Long,
        @PathVariable gastoId: Long,
        @RequestBody request: GastoRequestDTO
    ): ResponseEntity<Void> {

        val casa = casaRepository.findById(casaId).orElse(null)
            ?: return ResponseEntity.notFound().build()

        val gastoExistente = casa.gastos.find { it.id == gastoId }
            ?: return ResponseEntity.notFound().build()

        gastoExistente.nombre = request.nombre
        gastoExistente.descripcion = request.descripcion
        gastoExistente.importe = request.importe
        gastoExistente.categoria = try {
            CategoriaGasto.valueOf(request.categoria)
        } catch (e: Exception) {
            CategoriaGasto.OTROS
        }

        val nuevoPagador = usuarioRepository.findById(request.pagadoPorId).orElse(null)
        gastoExistente.pagadoPor = nuevoPagador

        gastoExistente.beneficiarios.clear()
        request.beneficiarios?.let { gastoExistente.beneficiarios.addAll(it) }

        casaRepository.save(casa)

        return ResponseEntity.ok().build()
    }


    @PostMapping("/escanear-ticket")
    fun escanearTicket(@RequestParam("file") file: MultipartFile): ResponseEntity<BorradorGastoDTO> {
        val borrador = gastoIAService.processarTicket(file)
        return ResponseEntity.ok(borrador)
    }

    @PostMapping("/{casaId}/gastos/{gastoId}/foto")
    @Transactional
    fun actualizarFotoTicket(
        @PathVariable casaId: Long,
        @PathVariable gastoId: Long,
        @RequestParam("file") file: MultipartFile
    ): ResponseEntity<String> {
        val casa = casaRepository.findById(casaId).orElse(null)
            ?: return ResponseEntity.notFound().build()

        val gasto = casa.gastos.find { it.id == gastoId }
            ?: return ResponseEntity.notFound().build()

        val nombreArchivo = fileStorageService.save(file)

        val baseUrl = org.springframework.web.servlet.support.ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString()
        val urlPublica = "$baseUrl/multimedia/$nombreArchivo"

        gasto.fotoTicketUrl = urlPublica
        casaRepository.save(casa)

        return ResponseEntity.ok(urlPublica)
    }

    @DeleteMapping("/{casaId}/gastos/{gastoId}/foto")
    @Transactional
    fun eliminarFotoTicket(
        @PathVariable casaId: Long,
        @PathVariable gastoId: Long
    ): ResponseEntity<Void> {
        val casa = casaRepository.findById(casaId).orElse(null)
            ?: return ResponseEntity.notFound().build()

        val gasto = casa.gastos.find { it.id == gastoId }
            ?: return ResponseEntity.notFound().build()

        gasto.fotoTicketUrl = null
        casaRepository.save(casa)

        return ResponseEntity.ok().build()
    }

    @GetMapping("/{casaId}/gastos/pdf")
    @Transactional(readOnly = true)
    fun descargarPdfGastos(@PathVariable casaId: Long): ResponseEntity<ByteArray> {
        val casa = casaRepository.findById(casaId).orElse(null)
            ?: return ResponseEntity.notFound().build()

        val pdfBytes = pdfService.generarResumenGastosPdf(casa)

        val headers = HttpHeaders()
        headers.contentType = org.springframework.http.MediaType.APPLICATION_PDF
        headers.setContentDispositionFormData("attachment", "Resumen_Gastos_${casa.nombre}.pdf")

        return ResponseEntity.ok()
            .headers(headers)
            .body(pdfBytes)
    }

}
