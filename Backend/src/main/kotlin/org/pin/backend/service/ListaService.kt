package org.pin.backend.service
import org.pin.backend.dto.Data.UsuarioDTO
import org.pin.backend.dto.Request.ListaRequestDTO
import org.pin.backend.dto.Response.ListaResponseDTO
import org.pin.backend.model.Lista
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.ListaRepository
import org.pin.backend.repository.UsuarioRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ListaService(
    private val repo: ListaRepository,
    private val casaRepository: CasaRepository,
    private val usuarioRepository: UsuarioRepository,
    private val listaRepository: ListaRepository,
) {
    fun findAll() = repo.findAll()

    fun getListasByCasaId(casaId: Long): List<ListaResponseDTO> {
        val listas = listaRepository.findByCasaId(casaId)
        return listas.map { convertirADTO(it) }
    }

    fun crearLista(
        casaId: Long,
        listaDTO: ListaRequestDTO,
        emailPropietario: String,
    ): Lista {
        val casa = casaRepository.findById(casaId).orElseThrow { RuntimeException("Casa no encontrada") }
        val propietario = usuarioRepository.findByCorreo(emailPropietario).orElseThrow { RuntimeException("Usuario no encontrado") }

        val lista =
            Lista(
                nombre = listaDTO.nombre,
                descripcion = listaDTO.descripcion,
                casa = casa,
                propietario = propietario,
                fechaCreacion = LocalDateTime.now(),
            )

        // 1. Añadir al propietario siempre como participante
        lista.participantes.add(propietario)

        // 2. Añadir a los participantes seleccionados (si los hay)
        if (!listaDTO.participantesIds.isNullOrEmpty()) {
            val usuariosInvitados = usuarioRepository.findAllById(listaDTO.participantesIds)
            // Filtramos para no añadir al propietario dos veces si se auto-seleccionó
            val nuevosInvitados = usuariosInvitados.filter { it.id != propietario.id }
            lista.participantes.addAll(nuevosInvitados)
        }

        return listaRepository.save(lista)
    }

    fun borrarLista(id: Long) {
        listaRepository.deleteById(id)
    }

    private fun convertirADTO(lista: Lista): ListaResponseDTO =
        ListaResponseDTO(
            id = lista.id ?: 0,
            nombre = lista.nombre,
            descripcion = lista.descripcion,
            fechaCreacion = lista.fechaCreacion.toString(),
            fechaEdicion = lista.fechaEdicion?.toString(),
            propietario =
                lista.propietario?.let {
                    UsuarioDTO(it.id ?: 0, it.nombre, it.correo)
                },
            participantes =
                lista.participantes.map {
                    UsuarioDTO(it.id ?: 0, it.nombre, it.correo)
                },
        )
}
