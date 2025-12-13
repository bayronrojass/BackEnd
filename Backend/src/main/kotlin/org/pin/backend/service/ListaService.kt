package org.pin.backend.service
import org.pin.backend.dto.Data.UsuarioDTO
import org.pin.backend.dto.Request.ListaRequestDTO
import org.pin.backend.dto.Response.ListaResponseDTO
import org.pin.backend.model.Lista
import org.pin.backend.repository.ListaRepository
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.UsuarioRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ListaService(
    private val repo: ListaRepository,
    private val casaRepository: CasaRepository,
    private val usuarioRepository: UsuarioRepository,
    private val listaRepository: ListaRepository
) {
    fun findAll() = repo.findAll()

    fun getListasByCasaId(casaId: Long): List<ListaResponseDTO> {
        val listas = listaRepository.findByCasaId(casaId)
        return listas.map { convertirADTO(it) }
    }

    fun crearLista(casaId: Long, listaDTO: ListaRequestDTO, emailPropietario: String): Lista {
        val casa = casaRepository.findById(casaId).orElseThrow { RuntimeException("Casa no encontrada") }
        val usuario = usuarioRepository.findByCorreo(emailPropietario).orElseThrow { RuntimeException("Usuario no encontrado") }

        val lista = Lista(
            nombre = listaDTO.nombre,
            descripcion = listaDTO.descripcion,
            casa = casa,
            propietario = usuario, // Asignamos propietario
            fechaCreacion = LocalDateTime.now()
        )
        // Añadimos al creador como participante automáticamente
        lista.participantes.add(usuario)

        return listaRepository.save(lista)
    }

    fun borrarLista(id: Long) {
        listaRepository.deleteById(id)
    }

    private fun convertirADTO(lista: Lista): ListaResponseDTO {
        return ListaResponseDTO(
            id = lista.id ?: 0,
            nombre = lista.nombre,
            descripcion = lista.descripcion,
            fechaCreacion = lista.fechaCreacion.toString(),
            fechaEdicion = lista.fechaEdicion?.toString(),
            propietario = lista.propietario?.let {
                UsuarioDTO(it.id ?: 0, it.nombre, it.correo)
            },
            participantes = lista.participantes.map {
                UsuarioDTO(it.id ?: 0, it.nombre, it.correo)
            }
        )
    }
}
