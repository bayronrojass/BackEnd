package org.pin.backend.service
import org.pin.backend.dto.Request.ElementoRequestDTO
import org.pin.backend.dto.Response.ElementoResponseDTO
import org.pin.backend.model.Elemento
import org.pin.backend.repository.ElementoRepository
import org.pin.backend.repository.ListaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ElementoService(
    private val repo: ElementoRepository,
) {
    @Autowired
    lateinit var elementoRepository: ElementoRepository

    @Autowired
    lateinit var listaRepository: ListaRepository

    fun findAll() = repo.findAll()

    @Transactional
    fun crearElemento(listaId: Long, request: ElementoRequestDTO): Elemento {

        val listaPadre = listaRepository.findById(listaId)
            .orElseThrow { RuntimeException("No existe ninguna lista con id $listaId") }

        val nuevoElemento = Elemento(
            nombre = request.nombre,
            descripcion = request.descripcion,
            completado = request.completado ?: false,
            cantidad = request.cantidad ?: 1,
            lista = listaPadre
        )

        return elementoRepository.saveAndFlush(nuevoElemento)
    }

    fun actualizarElemento(id: Long, request: ElementoRequestDTO): Elemento {
        val elemento = elementoRepository.findById(id)
            .orElseThrow { RuntimeException("Elemento no encontrado") }

        elemento.nombre = request.nombre
        elemento.descripcion = request.descripcion

        if (request.completado != null) {
            elemento.completado = request.completado
        }

        if (request.cantidad != null) {
            elemento.cantidad = request.cantidad
        }

        return elementoRepository.save(elemento)
    }

    fun borrarElemento(id: Long) {
        if (!elementoRepository.existsById(id)) {
            throw RuntimeException("Elemento no encontrado")
        }
        elementoRepository.deleteById(id)
    }

    fun getElementosByListaId(listaId: Long): List<ElementoResponseDTO> {
        val elementos = elementoRepository.findByListaId(listaId)
        return elementos.map { convertirADTO(it) }
    }

    fun convertirADTO(elemento: Elemento): ElementoResponseDTO {
        return ElementoResponseDTO(
            id = elemento.id ?: 0,
            nombre = elemento.nombre,
            descripcion = elemento.descripcion,
            completado = elemento.completado,
            cantidad = elemento.cantidad,
            iconoKey = elemento.iconoKey
        )
    }
}
