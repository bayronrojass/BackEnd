package org.pin.backend.service

import org.pin.backend.model.*
import org.pin.backend.model.dtos.EncuestaRequestDTO
import org.pin.backend.model.dtos.EncuestaResponseDTO
import org.pin.backend.model.dtos.OpcionResponseDTO
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.EncuestaRepository
import org.pin.backend.repository.OpcionRepository
import org.pin.backend.repository.UsuarioRepository
import org.pin.backend.repository.VotoRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class EncuestaService(
    private val encuestaRepository: EncuestaRepository,
    private val opcionRepository: OpcionRepository,
    private val votoRepository: VotoRepository,
    private val casaRepository: CasaRepository,
    private val usuarioRepository: UsuarioRepository,
    private val firebaseMessagingService: FirebaseMessagingService,
) {
    fun crearEncuestaParaCasa(
        casaId: Long,
        userId: Long,
        request: EncuestaRequestDTO,
    ): EncuestaResponseDTO {
        val casa =
            casaRepository
                .findById(casaId)
                .orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND, "Casa no encontrada") }

        val creador =
            usuarioRepository
                .findById(userId)
                .orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado") }

        if (request.opciones.size < 2) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, "Mínimo 2 opciones")
        }

        val nuevaEncuesta =
            Encuesta(
                titulo = request.titulo,
                creador = creador,
                colorHex = request.colorHex,
            ).apply {
                this.posicionX = 0f
                this.posicionY = 0f
                this.width = 0
                this.height = 0
                this.ruta = ""
                this.localizacion = "Seccion Encuestas"
                this.casa = casa
            }

        val opcionesEntidad = request.opciones.map { Opcion(texto = it, encuesta = nuevaEncuesta) }
        nuevaEncuesta.opciones.addAll(opcionesEntidad)

        val encuestaGuardada = encuestaRepository.save(nuevaEncuesta)

        casa.miembros.forEach { miembro ->
            if (miembro.id != userId) {
                firebaseMessagingService.enviarAUsuario(
                    usuarioId = miembro.id!!,
                    titulo = "Nueva encuesta en ${casa.nombre}",
                    cuerpo = "${creador.nombre} pregunta: ${nuevaEncuesta.titulo}",
                )
            }
        }

        return mapToResponseDTO(encuestaGuardada, userId)
    }

    fun getEncuestasByCasa(
        casaId: Long,
        userId: Long,
    ): List<EncuestaResponseDTO> {
        if (!casaRepository.existsById(casaId)) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "Casa no encontrada")
        }

        val encuestas = encuestaRepository.findByCasaId(casaId)

        return encuestas
            .map { mapToResponseDTO(it, userId) }
            .sortedByDescending { it.fechaCreacion }
    }

    fun votarEnEncuesta(
        encuestaId: Long,
        opcionId: Long,
        userId: Long,
    ) {
        val encuesta =
            encuestaRepository
                .findById(encuestaId)
                .orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND, "Encuesta no encontrada") }

        if (encuesta.estado == EstadoEncuesta.CERRADA) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, "La encuesta ya está cerrada")
        }

        val votante =
            usuarioRepository
                .findById(userId)
                .orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado") }

        // Comprobar si el usuario ya ha votado en ESTA encuesta
        val yaVoto =
            encuesta.opciones.any { opcion ->
                opcion.votos.any { voto -> voto.votante.id == userId }
            }

        if (yaVoto) {
            throw ResponseStatusException(HttpStatus.CONFLICT, "Ya has votado en esta encuesta")
        }

        val opcionElegida =
            opcionRepository
                .findById(opcionId)
                .orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND, "Opción no encontrada") }

        if (opcionElegida.encuesta?.id != encuestaId) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, "La opción no pertenece a esta encuesta")
        }

        val nuevoVoto = Voto(votante = votante, opcion = opcionElegida)
        votoRepository.save(nuevoVoto)
    }

    fun cerrarEncuesta(
        encuestaId: Long,
        userId: Long,
    ) {
        val encuesta =
            encuestaRepository
                .findById(encuestaId)
                .orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND, "Encuesta no encontrada") }

        // Añadir aquiif (encuesta.creador.id != userId) lanzar error

        encuesta.estado = EstadoEncuesta.CERRADA
        encuestaRepository.save(encuesta)
    }

    private fun mapToResponseDTO(
        encuesta: Encuesta,
        userId: Long,
    ): EncuestaResponseDTO {
        val haVotado =
            encuesta.opciones.any { opcion ->
                opcion.votos.any { voto -> voto.votante.id == userId }
            }

        val opcionesDTO =
            encuesta.opciones.map { opcion ->
                OpcionResponseDTO(
                    id = opcion.id!!,
                    texto = opcion.texto,
                    totalVotos = opcion.votos.size,
                )
            }

        return EncuestaResponseDTO(
            id = encuesta.id!!,
            titulo = encuesta.titulo,
            creadorNombre = encuesta.creador.nombre,
            estado = encuesta.estado,
            fechaCreacion = encuesta.fechaCreacion,
            opciones = opcionesDTO,
            haVotado = haVotado,
            colorHex = encuesta.colorHex,
        )
    }
}
