package org.pin.backend.controller

import org.pin.backend.dto.Data.CasaDTO
import org.pin.backend.dto.Data.ImagenDTO
import org.pin.backend.dto.Data.PostItDTO
import org.pin.backend.dto.Data.UsuarioDTO
import org.pin.backend.dto.Data.toDTO
import org.pin.backend.dto.Request.CasaRequestDTO
import org.pin.backend.dto.Request.JoinCasaRequest
import org.pin.backend.dto.Request.ListaRequestDTO
import org.pin.backend.dto.Request.TareaRequestDTO
import org.pin.backend.dto.Response.CasaDetailsResponseDTO
import org.pin.backend.dto.Response.CasaResponseDTO
import org.pin.backend.dto.Response.TareaResponseDTO
import org.pin.backend.dto.Response.UsuarioRankingDTO
import org.pin.backend.model.*
import org.pin.backend.repository.CasaRepository
import org.pin.backend.repository.ListaRepository
import org.pin.backend.repository.TareaRepository
import org.pin.backend.repository.UsuarioRepository
import org.pin.backend.service.CasaService
import org.pin.backend.service.FirebaseMessagingService
import org.pin.backend.service.ImagenService
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

@RestController
@RequestMapping("/casas")
class CasaController(
    private val service: CasaService,
    private val casaRepository: CasaRepository,
    private val usuarioRepository: UsuarioRepository,
    private val listaRepository: ListaRepository,
    private val tareaRepository: TareaRepository,
    private val postItService: PostItService,
    private val imagenService: ImagenService,
    private val firebaseMessagingService: FirebaseMessagingService,
) {
    private val logger: Logger = LoggerFactory.getLogger(CasaController::class.java)

    @GetMapping
    fun getAll() = service.findAll()

    @PostMapping(consumes = ["multipart/form-data"])
    fun crearCasa(
        @RequestPart("casa") request: CasaRequestDTO,
        @RequestPart("file", required = false) file: MultipartFile?,
    ): CasaResponseDTO {
        val casaGuardada =
            if (file != null && !file.isEmpty) {
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
    fun getListasByCasaId(
        @PathVariable casaId: Long,
    ): ResponseEntity<List<Lista>> {
        val casaOptional: Optional<Casa> = casaRepository.findById(casaId)
        return if (casaOptional.isPresent) {
            val casa = casaOptional.get()
            ResponseEntity.ok(casa.listas.toList())
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @GetMapping("/{id}/details")
    @Transactional(readOnly = true)
    fun getCasaDetails(
        @PathVariable id: Long,
    ): ResponseEntity<CasaDetailsResponseDTO> =
        casaRepository
            .findById(id)
            .map { casa ->
                val dto =
                    CasaDetailsResponseDTO(
                        id = casa.id!!,
                        nombre = casa.nombre,
                        descripcion = casa.descripcion,
                    )
                ResponseEntity.ok(dto)
            }.orElse(ResponseEntity.notFound().build())

    @DeleteMapping("/{casaId}/miembros/{usuarioId}")
    @Transactional
    fun removeMiembro(
        @PathVariable casaId: Long,
        @PathVariable usuarioId: Long,
        // TODO: Añadir Spring Security para verificar que quien llama es un admin
    ): ResponseEntity<Unit> {
        val casa =
            casaRepository
                .findById(casaId)
                .orElseThrow { Exception("Casa no encontrada") }

        val usuario =
            usuarioRepository
                .findById(usuarioId)
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
        @RequestBody request: ListaRequestDTO,
    ): ResponseEntity<Lista> {
        val casaOptional: Optional<Casa> = casaRepository.findById(casaId)
        if (casaOptional.isEmpty) {
            return ResponseEntity.notFound().build()
        }
        val casa = casaOptional.get()
        val nuevaLista =
            Lista(
                nombre = request.nombre,
                descripcion = request.descripcion,
            )

        val listaGuardada = listaRepository.save(nuevaLista)
        casa.listas.add(listaGuardada)
        casaRepository.save(casa)
        return ResponseEntity.status(HttpStatus.CREATED).body(listaGuardada)
    }

    @GetMapping("/{casaId}/tareas")
    @Transactional(readOnly = true)
    fun getTareasByCasaId(
        @PathVariable casaId: Long,
    ): ResponseEntity<List<TareaResponseDTO>> {
        val casa =
            casaRepository.findById(casaId).orElse(null)
                ?: return ResponseEntity.notFound().build()

        val tareasDTO =
            casa.tareas.map { tarea ->
                TareaResponseDTO(
                    id = tarea.id!!,
                    nombre = tarea.nombre,
                    descripcion = tarea.descripcion,
                    completado = tarea.completado,
                    fechaFin = tarea.fechaFin?.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                    frecuencia = tarea.frecuencia,
                    periodica = tarea.periodica,
                    asignadoA =
                        tarea.asignadoA?.let {
                            UsuarioDTO(it.id!!, it.nombre, it.correo)
                        },
                    prioridad = tarea.prioridad,
                )
            }
        return ResponseEntity.ok(tareasDTO)
    }

    @PostMapping("/{casaId}/tareas")
    @Transactional
    fun crearTareaEnCasa(
        @PathVariable casaId: Long,
        @RequestBody request: TareaRequestDTO,
    ): ResponseEntity<TareaResponseDTO> {
        val casa =
            casaRepository.findById(casaId).orElse(null)
                ?: return ResponseEntity.notFound().build()

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
                        LocalDateTime.parse(
                            request.fechaFin,
                            DateTimeFormatter.ISO_LOCAL_DATE_TIME,
                        )
                    },
                frecuencia = request.frecuencia,
                periodica = request.periodica ?: false,
                asignadoA = usuarioAsignado,
                casa = casa,
            )

        val tareaGuardada = tareaRepository.save(nuevaTarea)
        casa.tareas.add(tareaGuardada)
        casaRepository.save(casa)
        if (request.asignadoAId !=
            request.creadoPor
        ) {
            firebaseMessagingService.enviarAUsuario(request.asignadoAId!!, "¡Nueva tarea asignada!", request.nombre)
        }

        val responseDTO =
            TareaResponseDTO(
                id = tareaGuardada.id!!,
                nombre = tareaGuardada.nombre,
                descripcion = tareaGuardada.descripcion,
                completado = tareaGuardada.completado,
                fechaFin = tareaGuardada.fechaFin?.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                frecuencia = tareaGuardada.frecuencia,
                periodica = tareaGuardada.periodica,
                asignadoA =
                    tareaGuardada.asignadoA?.let {
                        UsuarioDTO(it.id!!, it.nombre, it.correo)
                    },
                prioridad = tareaGuardada.prioridad,
            )

        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO)
    }

    @PostMapping("/{id}/{location}/postIt")
    fun crearPostIt(
        @PathVariable id: Long,
        @PathVariable location: String,
    ): ResponseEntity<PostItDTO> {
        val casa = service.findById(id)
        if (casa.isPresent) {
            val postIt = postItService.new(casa.get(), location)
            casa.get().multimedia.add(postIt)
            service.save(casa.get())
            logger.info("$postIt ${postIt.id}")
            return ResponseEntity.ok(
                PostItDTO(
                    postIt.id!!,
                    postIt.lienzo!!.id!!,
                    0f,
                    0f,
                    postIt.lienzo!!.width.toInt(),
                    postIt.lienzo!!.height.toInt(),
                    postIt.localizacion,
                ),
            )
        }
        return ResponseEntity.notFound().build()
    }

    @GetMapping("/{id}/{location}/postIt")
    fun getPostIt(
        @PathVariable id: Long,
        @PathVariable location: String,
    ): ResponseEntity<List<PostItDTO>> {
        val casa = service.findById(id)
        if (casa.isPresent) {
            val lista =
                casa
                    .get()
                    .multimedia
                    .filter { it is PostIt && it !is Imagen }
                    .filter { it.localizacion == location }
                    .map {
                        it as PostIt
                        PostItDTO(
                            it.id!!,
                            it.lienzo!!.id!!,
                            it.posicionX,
                            it.posicionY,
                            it.width,
                            it.height,
                            it.localizacion,
                        )
                    }.toList()
            return ResponseEntity.ok(lista)
        }
        return ResponseEntity.notFound().build()
    }

    @GetMapping("/{id}/imagen")
    fun getImagenes(
        @PathVariable id: Long,
    ): ResponseEntity<List<Long>> {
        val casa = service.findById(id)
        if (casa.isPresent) {
            val lista =
                casa
                    .get()
                    .multimedia
                    .filterIsInstance<Imagen>()
                    .map { it.id!! }
                    .toList()
            return ResponseEntity.ok(lista)
        }
        return ResponseEntity.notFound().build()
    }

    @PostMapping("/{id}/imagen", consumes = ["multipart/form-data"])
    fun crearImagenes(
        @PathVariable id: Long,
        @RequestPart("file", required = true) file: MultipartFile,
    ): ResponseEntity<ImagenDTO> {
        val casa = service.findById(id)
        if (casa.isPresent) {
            val i = imagenService.new(casa.get(), file)
            if (i.isEmpty) {
                return ResponseEntity.noContent().build()
            }

            val imagen = i.get()
            casa.get().multimedia.add(imagen)
            service.save(casa.get())
            return ResponseEntity.ok(
                ImagenDTO(imagen.id!!, imagen.lienzo!!.id!!, 0f, 0f, imagen.width, imagen.height, imagen.localizacion),
            )
        }
        return ResponseEntity.notFound().build()
    }

    @GetMapping("/{id}/miembros")
    @Transactional(readOnly = true)
    fun getCasaMiembros(
        @PathVariable id: Long,
    ): ResponseEntity<List<UsuarioDTO>> =
        casaRepository
            .findById(id)
            .map { casa ->
                val miembros = casa.miembros
                val miembrosDTO = miembros.map { it.toDTO() }
                ResponseEntity.ok(miembrosDTO)
            }.orElse(ResponseEntity.notFound().build())

    @PostMapping("/{casaId}/join")
    @Transactional
    fun joinCasa(
        @PathVariable casaId: Long,
        @RequestBody request: JoinCasaRequest,
    ): ResponseEntity<String> {
        val casa =
            casaRepository
                .findById(casaId)
                .orElseThrow { Exception("Casa no encontrada") }

        val usuario =
            usuarioRepository
                .findById(request.usuarioId)
                .orElseThrow { Exception("Usuario no encontrado") }

        if (casa.miembros.none { it.id == usuario.id }) {
            casa.miembros.add(usuario)
            casaRepository.save(casa)
        }

        return ResponseEntity.ok("¡Unido a la casa '${casa.nombre}' exitosamente!")
    }

    @GetMapping("/usuario/{usuarioId}")
    fun getCasasDeUsuario(@PathVariable usuarioId: Long): ResponseEntity<List<CasaDTO>> {
        val casas = service.obtenerCasasDeUsuario(usuarioId)
        return ResponseEntity.ok(casas)
    }

    @GetMapping("/{casaId}/ranking")
    @Transactional(readOnly = true)
    fun getRankingCasa(@PathVariable casaId: Long): ResponseEntity<List<UsuarioRankingDTO>> {
        val casa = casaRepository.findById(casaId).orElse(null)
            ?: return ResponseEntity.notFound().build()

        val miembrosOrdenados = casa.miembros.sortedByDescending { it.puntosConvivencia }

        val ranking = miembrosOrdenados.mapIndexed { index, usuario ->
            UsuarioRankingDTO(
                posicion = index + 1,
                usuarioId = usuario.id!!,
                nombre = usuario.nombre,
                fotoUrl = usuario.fotoUrl,
                puntos = usuario.puntosConvivencia
            )
        }

        return ResponseEntity.ok(ranking)
    }
}
