package org.pin.backend.controller

import org.pin.backend.dto.*
import org.pin.backend.model.Casa
import org.pin.backend.model.Lista
import org.pin.backend.model.PostIt
import org.pin.backend.model.Tarea
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.ListaRepository
import org.pin.backend.repository.TareaRepository
import org.pin.backend.repository.UsuarioRepository
import org.pin.backend.service.CasaService
import org.pin.backend.service.PostItService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import org.pin.backend.dto.UsuarioDTO
import org.pin.backend.dto.toDTO

@RestController
@RequestMapping("/casas")
class CasaController(
    private val service: CasaService,
    private val casaRepository: CasaRepository,
    private val usuarioRepository: UsuarioRepository,
    private val listaRepository: ListaRepository,
    private val tareaRepository: TareaRepository,
    private val postItService: PostItService,
) {
    private val logger: Logger = LoggerFactory.getLogger(CasaController::class.java)
    @GetMapping
    fun getAll() = service.findAll()

    @PostMapping(consumes = ["multipart/form-data"])
    fun crearCasa(
        @RequestPart("casa") request: CasaRequestDTO,
        @RequestPart("file", required = false) file: MultipartFile?
    ): CasaResponseDTO {

        val casaGuardada = if (file != null && !file.isEmpty) {
            service.crearNuevaCasa(request, file)
        } else {
            service.crearNuevaCasaSinImagen(request)
        }

        return CasaResponseDTO(
            id = casaGuardada.id!!,
            nombre = casaGuardada.nombre,
            descripcion = casaGuardada.descripcion,
            fechaCreacion = casaGuardada.fechaCreacion,
        )
    }

    @GetMapping("/{casaId}/listas")
    @Transactional(readOnly = true)
    fun getListasByCasaId(@PathVariable casaId: Long): ResponseEntity<List<Lista>> {
        val casaOptional: Optional<Casa> = casaRepository.findById(casaId)
        return if (casaOptional.isPresent) {
            val casa = casaOptional.get()
            // Accedemos a casa.listas DENTRO de la transacción
            ResponseEntity.ok(casa.listas.toList())
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @GetMapping("/{id}/details")
    @Transactional(readOnly = true)
    fun getCasaDetails(@PathVariable id: Long): ResponseEntity<CasaDetailsResponseDTO> {
        return casaRepository.findById(id).map { casa ->
            val dto = CasaDetailsResponseDTO(
                id = casa.id!!,
                nombre = casa.nombre,
                descripcion = casa.descripcion,
                miembros = casa.miembros.toList(),
                administradores = casa.administradores.toList()
            )
            ResponseEntity.ok(dto)
        }.orElse(ResponseEntity.notFound().build())
    }


    @DeleteMapping("/{casaId}/miembros/{usuarioId}")
    @Transactional
    fun removeMiembro(
        @PathVariable casaId: Long,
        @PathVariable usuarioId: Long
        // TODO: Añadir Spring Security para verificar que quien llama es un admin
    ): ResponseEntity<Unit> {
        val casa = casaRepository.findById(casaId)
            .orElseThrow { Exception("Casa no encontrada") }

        val usuario = usuarioRepository.findById(usuarioId)
            .orElseThrow { Exception("Usuario no encontrado") }

        if (casa.miembros.contains(usuario)) {
            casa.miembros.remove(usuario)
        }
        if (casa.administradores.contains(usuario)) {
            casa.administradores.remove(usuario)
        }

        casaRepository.save(casa)
        return ResponseEntity.ok().build()
    }

    @PostMapping("/{casaId}/listas")
    @Transactional
    fun crearListaEnCasa(
        @PathVariable casaId: Long,
        @RequestBody request: ListaRequestDTO
    ): ResponseEntity<Lista> {
        val casaOptional: Optional<Casa> = casaRepository.findById(casaId)
        if (casaOptional.isEmpty) {
            return ResponseEntity.notFound().build()
        }

        val casa = casaOptional.get()

        // 1. Crea la nueva entidad Lista
        val nuevaLista = Lista(
            nombre = request.nombre,
            descripcion = request.descripcion
        )

        // 2. Guarda la Lista PRIMERO para obtener su ID
        val listaGuardada = listaRepository.save(nuevaLista)

        // 3. Añade la lista (ya con ID) a la casa
        casa.listas.add(listaGuardada)

        // 4. Guarda la casa para actualizar la relación
        casaRepository.save(casa)

        // 5. Devuelve la lista CON ID
        return ResponseEntity.status(HttpStatus.CREATED).body(listaGuardada)
    }

    @GetMapping("/{casaId}/tareas")
    @Transactional(readOnly = true)
    fun getTareasByCasaId(@PathVariable casaId: Long): ResponseEntity<List<TareaResponseDTO>> {
        val casa = casaRepository.findById(casaId).orElse(null)
            ?: return ResponseEntity.notFound().build()

        // Mapea Tarea a TareaResponseDTO
        val tareasDTO = casa.tareas.map { tarea ->
            TareaResponseDTO(
                id = tarea.id!!,
                nombre = tarea.nombre,
                descripcion = tarea.descripcion,
                completado = tarea.completado,
                fechaFin = tarea.fechaFin?.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                frecuencia = tarea.frecuencia,
                periodica = tarea.periodica,
                asignadoA = tarea.asignadoA?.let {
                    UsuarioDTO(it.id!!, it.nombre, it.correo)
                }
            )
        }
        return ResponseEntity.ok(tareasDTO)
    }

    @PostMapping("/{casaId}/tareas")
    @Transactional
    fun crearTareaEnCasa(
        @PathVariable casaId: Long,
        @RequestBody request: TareaRequestDTO
    ): ResponseEntity<TareaResponseDTO> {
        val casa = casaRepository.findById(casaId).orElse(null)
            ?: return ResponseEntity.notFound().build()

        // Busca al usuario asignado (si se pasó un ID)
        val usuarioAsignado = request.asignadoAId?.let {
            usuarioRepository.findById(it).orElse(null)
        }

        val nuevaTarea = Tarea(
            nombre = request.nombre,
            descripcion = request.descripcion,
            completado = request.completado ?: false,
            fechaFin = if (request.fechaFin.isNullOrBlank()) null else LocalDateTime.parse(request.fechaFin, DateTimeFormatter.ISO_LOCAL_DATE_TIME),
            frecuencia = request.frecuencia,
            periodica = request.periodica ?: false,
            asignadoA = usuarioAsignado,
            casa = casa
        )

        val tareaGuardada = tareaRepository.save(nuevaTarea)
        casa.tareas.add(tareaGuardada)
        casaRepository.save(casa)

        val responseDTO = TareaResponseDTO(
            id = tareaGuardada.id!!,
            nombre = tareaGuardada.nombre,
            descripcion = tareaGuardada.descripcion,
            completado = tareaGuardada.completado,
            fechaFin = tareaGuardada.fechaFin?.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
            frecuencia = tareaGuardada.frecuencia,
            periodica = tareaGuardada.periodica,
            asignadoA = tareaGuardada.asignadoA?.let {
                UsuarioDTO(it.id!!, it.nombre, it.correo)
            }
        )

        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO)
    }

    @GetMapping("/{id}/postIt")
    fun getPostIt(
        @PathVariable id: Long,
    ): ResponseEntity<List<Long>> {
        val casa = service.findById(id)
        if (casa.isPresent) {
            val lista = casa.get().multimedia.filterIsInstance<PostIt>().map { it.id!! }.toList()
            return ResponseEntity.ok(lista)
        }
        return ResponseEntity.notFound().build()
    }

    @GetMapping("/{id}/lienzo")
    fun getLienzo(
        @PathVariable id: Long,
    ): ResponseEntity<Long> {
        logger.info("Getting Lienzo by id {}", id)
        val casa = service.findById(id)
        if (casa.isPresent) {
            return ResponseEntity.ok(casa.get().lienzo.id)
        }
        return ResponseEntity.notFound().build()
    }

    @PostMapping("/{id}/postIt")
    fun crearPostIt(
        @PathVariable id: Long,
    ): ResponseEntity<PostItDTO> {
        val casa = service.findById(id)
        if (casa.isPresent) {
            val postIt = postItService.new(casa.get())
            casa.get().multimedia.add(postIt)
            service.save(casa.get())
            logger.info("$postIt ${postIt.id}")
            return ResponseEntity.ok(PostItDTO(postIt.id!!, postIt.lienzo!!.id!!, 0f, 0f, false))
        }
        return ResponseEntity.notFound().build()
    }

    @GetMapping("/{id}/miembros")
    @Transactional(readOnly = true)
    fun getCasaMiembros(@PathVariable id: Long): ResponseEntity<List<UsuarioDTO>> {
        return casaRepository.findById(id).map { casa ->
            // 1. Carga los miembros
            val miembros = casa.miembros
            // 2. Convierte a DTO para evitar el bucle
            val miembrosDTO = miembros.map { it.toDTO() }
            // 3. Devuelve solo la lista de DTOs
            ResponseEntity.ok(miembrosDTO)
        }.orElse(ResponseEntity.notFound().build())
    }

    @PostMapping("/{casaId}/join")
    @Transactional
    fun joinCasa(
        @PathVariable casaId: Long,
        @RequestBody request: JoinCasaRequest
    ): ResponseEntity<String> {

        val casa = casaRepository.findById(casaId)
            .orElseThrow { Exception("Casa no encontrada") }

        val usuario = usuarioRepository.findById(request.usuarioId)
            .orElseThrow { Exception("Usuario no encontrado") }

        if (casa.miembros.none { it.id == usuario.id }) {
            casa.miembros.add(usuario)
            casaRepository.save(casa)
        }

        return ResponseEntity.ok("¡Unido a la casa '${casa.nombre}' exitosamente!")
    }

}