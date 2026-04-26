package org.pin.backend.service

import org.pin.backend.model.UsuarioLogro
import org.pin.backend.repository.LogroRepository
import org.pin.backend.repository.UsuarioLogroRepository
import org.pin.backend.repository.UsuarioRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime

@Service
class LogroService(
    private val usuarioRepository: UsuarioRepository,
    private val logroRepository: LogroRepository,
    private val usuarioLogroRepository: UsuarioLogroRepository
) {

    // SISTEMA DE PUNTOS
    @Transactional
    fun sumarPuntos(usuarioId: Long, puntos: Int) {
        val usuario = usuarioRepository.findById(usuarioId).orElse(null) ?: return
        usuario.puntosConvivencia += puntos
        usuarioRepository.save(usuario)
    }

    // EVALUACIÓN DE ACCIONES
    @Transactional
    fun procesarTareaCompletada(usuarioId: Long, diasRetraso: Long) {
        // Asignar puntos por la tarea según el retraso
        val puntos = when {
            diasRetraso <= 0 -> 50
            diasRetraso == 1L -> 30
            diasRetraso in 2..3 -> 15
            else -> 5
        }
        sumarPuntos(usuarioId, puntos)

        // Avanzar progresos de medallas
        avanzarLogro(usuarioId, "TAREAS_MISTER_PROPER")
        if (diasRetraso <= 0) {
            avanzarLogro(usuarioId, "TAREAS_RELOJ_SUIZO")
        }
    }

    @Transactional
    fun procesarPagoBizum(usuarioId: Long, horasRetraso: Long) {
        val puntos = when {
            horasRetraso <= 24 -> 40
            horasRetraso <= 72 -> 20
            horasRetraso <= 168 -> 10 // 1 semana
            else -> 2
        }
        sumarPuntos(usuarioId, puntos)

        if (horasRetraso <= 24) {
            avanzarLogro(usuarioId, "ECONOMIA_MOROSO_CERO")
        }
    }

    @Transactional
    fun procesarGastoCreado(usuarioId: Long, usadoIA: Boolean) {
        sumarPuntos(usuarioId, if (usadoIA) 15 else 10)
        avanzarLogro(usuarioId, "ECONOMIA_CONTABLE")
        if (usadoIA) {
            avanzarLogro(usuarioId, "ECONOMIA_TECH")
        }
    }

    @Transactional
    fun procesarPostItCreado(usuarioId: Long) {
        sumarPuntos(usuarioId, 5)
        avanzarLogro(usuarioId, "SOCIAL_COMUNICADOR")
    }

    // LÓGICA INTERNA DE MEDALLAS
    /**
     * Busca el nivel actual del usuario en un logro (Bronce, Plata u Oro) y le suma 1 al progreso.
     */
    private fun avanzarLogro(usuarioId: Long, prefijoCodigo: String) {
        val usuario = usuarioRepository.findById(usuarioId).orElse(null) ?: return
        val nivelesLogro = logroRepository.findByCodigoStartingWithOrderByMetaAsc(prefijoCodigo)

        for (logro in nivelesLogro) {
            var usuarioLogro = usuarioLogroRepository.findByUsuarioAndLogro(usuario, logro)

            if (usuarioLogro == null) {
                usuarioLogro = UsuarioLogro(usuario = usuario, logro = logro, progreso = 0)
            }

            if (usuarioLogro.fechaCompletado == null) {
                usuarioLogro.progreso += 1

                if (usuarioLogro.progreso >= logro.meta) {
                    usuarioLogro.fechaCompletado = LocalDateTime.now()
                }

                usuarioLogroRepository.save(usuarioLogro)
                break
            }
        }
    }
}
