package org.pin.backend.service
import org.pin.backend.dto.Request.ElementoRequestDTO
import org.pin.backend.dto.Response.ElementoResponseDTO
import org.pin.backend.model.CatalogoProducto
import org.pin.backend.model.Elemento
import org.pin.backend.repository.CatalogoProductoRepository
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

    @Autowired
    lateinit var catalogoRepository: CatalogoProductoRepository

    fun findAll() = repo.findAll()

    @Transactional
    fun crearElemento(listaId: Long, request: ElementoRequestDTO): Elemento {
        val listaPadre = listaRepository.findById(listaId)
            .orElseThrow { RuntimeException("No existe ninguna lista con id $listaId") }

        val nombreNormalizado = request.nombre.trim().replaceFirstChar { it.uppercase() }

        val elementosDeLaLista = elementoRepository.findByListaId(listaId)
        val elementoExistente = elementosDeLaLista.find {
            it.nombre.equals(nombreNormalizado, ignoreCase = true) && !it.completado
        }

        if (elementoExistente != null) {
            elementoExistente.cantidad += (request.cantidad ?: 1)
            return elementoRepository.saveAndFlush(elementoExistente)
        }

        val productoEnCatalogo = catalogoRepository.findByNombreIgnoreCase(nombreNormalizado)
        var iconoParaGuardar = "ic_default"

        if (productoEnCatalogo == null) {
            val nuevoProductoCatalogo = CatalogoProducto(
                nombre = nombreNormalizado,
                categoria = "Otros",
                iconoKey = iconoParaGuardar
            )
            catalogoRepository.save(nuevoProductoCatalogo)
        } else {
            iconoParaGuardar = productoEnCatalogo.iconoKey
        }

        val nuevoElemento = Elemento(
            nombre = nombreNormalizado,
            descripcion = request.descripcion,
            completado = request.completado ?: false,
            cantidad = request.cantidad ?: 1,
            lista = listaPadre,
            iconoKey = iconoParaGuardar
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
