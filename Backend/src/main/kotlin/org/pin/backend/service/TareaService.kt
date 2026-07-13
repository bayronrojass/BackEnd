package org.pin.backend.service

import org.pin.backend.dto.Data.UsuarioDTO
import org.pin.backend.dto.Request.TareaRequestDTO
import org.pin.backend.dto.Response.TareaResponseDTO
import org.pin.backend.model.PreferenciaTarea
import org.pin.backend.model.Tarea
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.PreferenciaTareaRepository
import org.pin.backend.repository.TareaRepository
import org.pin.backend.repository.UsuarioRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

@Service
@Transactional
class TareaService(
    private val repo: TareaRepository,
    private val usuarioRepository: UsuarioRepository,
    private val casaRepository: CasaRepository,
    private val firebaseMessagingService: FirebaseMessagingService,
    private val logroService: LogroService,
    private val preferenciaTareaRepository: PreferenciaTareaRepository,
    private val asignacionTareasService: AsignacionTareasService,
) {
    fun findAll() = repo.findAll()

    @Transactional(readOnly = true)
    fun getTareasByCasaId(casaId: Long): List<TareaResponseDTO>? {
        val casa = casaRepository.findByIdWithTareas(casaId) ?: return null

        return casa.tareas.map { tarea ->
            toResponseDTO(tarea)
        }
    }

    fun crearTareaEnCasa(
        casaId: Long,
        request: TareaRequestDTO,
    ): TareaResponseDTO? {
        val casa = casaRepository.findById(casaId).orElse(null) ?: return null

        val usuarioAsignado =
            request.asignadoAId?.let {
                usuarioRepository.findById(it).orElse(null)
            }

        val nuevaTarea =
            Tarea(
                nombre = request.nombre,
                descripcion = request.descripcion,
                completado = request.completado ?: false,
                fechaFin =
                    if (request.fechaFin.isNullOrBlank()) {
                        null
                    } else {
                        LocalDateTime.parse(request.fechaFin, DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    },
                frecuencia = request.frecuencia,
                periodica = request.periodica ?: false,
                asignadoA = usuarioAsignado,
                casa = casa,
            )

        val tareaGuardada = repo.save(nuevaTarea)
        casa.tareas.add(tareaGuardada)
        casaRepository.save(casa)

        if (request.asignadoAId != request.creadoPor) {
            firebaseMessagingService.enviarAUsuario(request.asignadoAId!!, "¡Nueva tarea asignada!", request.nombre)
        }

        return toResponseDTO(tareaGuardada)
    }

    fun actualizarTarea(
        tareaId: Long,
        request: TareaRequestDTO,
    ): TareaResponseDTO? {
        val tarea = repo.findById(tareaId).orElse(null) ?: return null
        val estabaCompletada = tarea.completado

        request.nombre.let { tarea.nombre = it }
        request.descripcion?.let { tarea.descripcion = it }
        request.completado?.let { tarea.completado = it }
        tarea.fechaFin =
            when {
                request.fechaFin == null -> tarea.fechaFin
                request.fechaFin.isBlank() -> null
                else -> LocalDateTime.parse(request.fechaFin, DateTimeFormatter.ISO_LOCAL_DATE_TIME)
            }
        request.frecuencia?.let { tarea.frecuencia = it }
        request.periodica?.let { tarea.periodica = it }
        request.prioridad?.let { tarea.prioridad = it }

        if (request.asignadoAId != null) {
            if (request.asignadoAId == -1L) {
                tarea.asignadoA = null
            } else {
                tarea.asignadoA = usuarioRepository.findById(request.asignadoAId).orElse(null)
            }
        }

        val tareaGuardada = repo.save(tarea)

        if (request.asignadoAId != request.creadoPor) {
            firebaseMessagingService.enviarAUsuario(request.asignadoAId!!, "¡Nueva tarea asignada!", request.nombre)
        }

        if (request.completado == true && !estabaCompletada) {
            val usuarioAsignadoId = tareaGuardada.asignadoA?.id
            if (usuarioAsignadoId != null) {
                val diasRetraso =
                    if (tareaGuardada.fechaFin != null) {
                        ChronoUnit.DAYS.between(tareaGuardada.fechaFin, LocalDateTime.now())
                    } else {
                        0L
                    }
                logroService.procesarTareaCompletada(usuarioAsignadoId, diasRetraso)
            }
        }

        return toResponseDTO(tareaGuardada)
    }

    fun borrarTarea(tareaId: Long): Boolean {
        val tarea = repo.findById(tareaId).orElse(null) ?: return false

        val casa = casaRepository.findByTareasContains(tarea).orElse(null)
        if (casa != null) {
            casa.tareas.remove(tarea)
            casaRepository.save(casa)
        } else {
            repo.delete(tarea)
        }

        return true
    }

    fun notificarTarea(tareaId: Long): Boolean {
        val tarea = repo.findById(tareaId).orElse(null) ?: return false

        if (tarea.asignadoA == null) return false

        firebaseMessagingService.enviarAUsuario(
            usuarioId = tarea.asignadoA!!.id!!,
            titulo = "¡Recordatorio de tarea en ${tarea.casa?.nombre ?: "tu piso"}!",
            cuerpo = "Por favor, no te olvides de: ${tarea.nombre}",
        )
        return true
    }

    fun votarTarea(
        tareaId: Long,
        usuarioId: Long,
        puntuacion: Int,
    ): Boolean {
        val tarea = repo.findById(tareaId).orElse(null) ?: return false
        val usuario = usuarioRepository.findById(usuarioId).orElse(null) ?: return false

        var preferencia = preferenciaTareaRepository.findByTareaIdAndUsuarioId(tareaId, usuarioId)

        if (preferencia == null) {
            preferencia = PreferenciaTarea(tarea = tarea, usuario = usuario, puntuacion = puntuacion)
        } else {
            preferencia.puntuacion = puntuacion
        }

        preferenciaTareaRepository.save(preferencia)
        return true
    }

    fun ejecutarRepartoInteligente(casaId: Long): String {
        val preferencias = preferenciaTareaRepository.findByTareaCasaId(casaId)
        val casa =
            casaRepository.findById(casaId).orElse(null)
                ?: return "Casa no encontrada"

        val usuariosVotantes = preferencias.mapNotNull { it.usuario?.id }.distinct()

        if (casa.miembros.size > 1 && usuariosVotantes.size < 1) {
            return "Faltan votos. Al menos 2 personas deben deslizar antes de repartir las tareas."
        }

        asignacionTareasService.repartirTareas(casaId, preferencias)
        preferenciaTareaRepository.deleteAll(preferencias)

        return "OK"
    }

    fun completarTarea(tareaId: Long): TareaResponseDTO? {
        val tarea = repo.findById(tareaId).orElse(null) ?: return null

        if (tarea.periodica) {
            val miembros = tarea.casa?.miembros?.toList() ?: emptyList()
            if (miembros.isNotEmpty()) {
                val indexActual = miembros.indexOfFirst { it.id == tarea.asignadoA?.id }
                val siguienteIndex = (indexActual + 1) % miembros.size
                tarea.asignadoA = miembros[siguienteIndex]
                tarea.fechaFin = tarea.fechaFin?.plusDays(7)
            }
        } else {
            tarea.completado = true
        }

        val tareaGuardada = repo.save(tarea)
        return toResponseDTO(tareaGuardada)
    }

    private fun toResponseDTO(tarea: Tarea): TareaResponseDTO =
        TareaResponseDTO(
            id = tarea.id!!,
            nombre = tarea.nombre,
            descripcion = tarea.descripcion,
            completado = tarea.completado,
            fechaFin = tarea.fechaFin?.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
            frecuencia = tarea.frecuencia,
            periodica = tarea.periodica,
            asignadoA = tarea.asignadoA?.let { UsuarioDTO(it.id!!, it.nombre, it.correo) },
            prioridad = tarea.prioridad,
        )
}
