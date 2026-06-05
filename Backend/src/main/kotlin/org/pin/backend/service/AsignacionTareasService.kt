package org.pin.backend.service
import org.pin.backend.repository.TareaRepository
import org.pin.backend.repository.CasaRepository
import org.pin.backend.model.PreferenciaTarea
import org.pin.backend.model.Usuario
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class AsignacionTareasService(
    private val tareaRepository: TareaRepository,
    private val casaRepository: CasaRepository
) {
    fun repartirTareas(casaId: Long, preferencias: List<PreferenciaTarea>) {
        val casa = casaRepository.findById(casaId).orElseThrow()
        val tareas = casa.tareas.filter { !it.completado }
        val miembros = casa.miembros.toList()

        // Mapa para llevar la cuenta de cuántas tareas tiene asignadas cada uno
        val cargaTrabajo = miembros.associateWith { 0 }.toMutableMap()

        // Agrupar preferencias por tarea
        val preferenciasPorTarea = preferencias.groupBy { it.tarea }

        for (tarea in tareas) {
            // Obtener votos para esta tarea
            val votosTarea = preferenciasPorTarea[tarea] ?: emptyList()

            // Ordenar los miembros primero por su voto (de mayor a menor)
            // y luego por su carga de trabajo (de menor a mayor) para desempatar
            val mejorMiembro = miembros.sortedWith(
                compareByDescending<Usuario> { miembro ->
                    votosTarea.find { it.usuario?.id == miembro.id }?.puntuacion ?: 0
                }.thenBy { miembro ->
                    cargaTrabajo[miembro] ?: 0
                }
            ).first()

            // Asignar tarea y sumar carga de trabajo
            tarea.asignadoA = mejorMiembro
            cargaTrabajo[mejorMiembro] = (cargaTrabajo[mejorMiembro] ?: 0) + 1
        }

        tareaRepository.saveAll(tareas)
    }
}
