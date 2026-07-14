package org.pin.backend.service

import org.pin.backend.dto.Request.GastoRequestDTO
import org.pin.backend.dto.Response.GastoResponseDTO
import org.pin.backend.model.Gasto
import org.pin.backend.model.enums.CategoriaGasto
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.GastoRepository
import org.pin.backend.repository.UsuarioRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.multipart.MultipartFile
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Service
@Transactional
class GastoService(
    private val repo: GastoRepository,
    private val casaRepository: CasaRepository,
    private val usuarioRepository: UsuarioRepository,
    private val fileStorageService: FileStorageService,
    private val logroService: LogroService,
) {
    fun findAll() = repo.findAll()

    @Transactional(readOnly = true)
    fun getGastosByCasaId(
        casaId: Long,
        pageable: Pageable,
    ): Page<GastoResponseDTO> = repo.findByCasaIdPaged(casaId, pageable).map(::toResponseDTO)

    private fun toResponseDTO(gasto: Gasto): GastoResponseDTO =
        GastoResponseDTO(
            id = gasto.id!!,
            nombre = gasto.nombre,
            descripcion = gasto.descripcion,
            importe = gasto.importe,
            fecha = gasto.fechaInicio.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
            categoria = gasto.categoria.name,
            pagadoPorNombre = gasto.pagadoPor?.nombre ?: "Desconocido",
            beneficiarios = gasto.beneficiarios.toMutableList(),
            fotoTicketUrl = gasto.fotoTicketUrl,
        )

    fun crearGasto(
        casaId: Long,
        request: GastoRequestDTO,
    ): Boolean {
        val casa = casaRepository.findById(casaId).orElse(null) ?: return false
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
                beneficiarios = request.beneficiarios?.toMutableSet() ?: mutableSetOf(),
                fotoTicketUrl = request.urlTicket,
            )

        casa.gastos.add(nuevoGasto)
        casaRepository.save(casa)

        val usadoIA = !request.urlTicket.isNullOrBlank()
        logroService.procesarGastoCreado(request.pagadoPorId, usadoIA)

        return true
    }

    fun editarGasto(
        casaId: Long,
        gastoId: Long,
        request: GastoRequestDTO,
    ): Boolean {
        val casa = casaRepository.findById(casaId).orElse(null) ?: return false
        val gastoExistente = casa.gastos.find { it.id == gastoId } ?: return false

        gastoExistente.nombre = request.nombre
        gastoExistente.descripcion = request.descripcion
        gastoExistente.importe = request.importe
        gastoExistente.categoria =
            try {
                CategoriaGasto.valueOf(request.categoria)
            } catch (e: Exception) {
                CategoriaGasto.OTROS
            }

        val nuevoPagador = usuarioRepository.findById(request.pagadoPorId).orElse(null)
        gastoExistente.pagadoPor = nuevoPagador

        gastoExistente.beneficiarios.clear()
        request.beneficiarios?.let { gastoExistente.beneficiarios.addAll(it) }

        casaRepository.save(casa)
        return true
    }

    fun actualizarFotoTicket(
        casaId: Long,
        gastoId: Long,
        file: MultipartFile,
    ): String? {
        val casa = casaRepository.findById(casaId).orElse(null) ?: return null
        val gasto = casa.gastos.find { it.id == gastoId } ?: return null

        val nombreArchivo = fileStorageService.save(file)
        val baseUrl = ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString()
        val urlPublica = "$baseUrl/multimedia/$nombreArchivo"

        gasto.fotoTicketUrl = urlPublica
        casaRepository.save(casa)

        return urlPublica
    }

    fun eliminarFotoTicket(
        casaId: Long,
        gastoId: Long,
    ): Boolean {
        val casa = casaRepository.findById(casaId).orElse(null) ?: return false
        val gasto = casa.gastos.find { it.id == gastoId } ?: return false

        gasto.fotoTicketUrl = null
        casaRepository.save(casa)
        return true
    }
}
