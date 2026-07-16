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
import org.pin.backend.repository.UsuarioRepository
import org.pin.backend.security.CasaMembershipValidator
import org.pin.backend.service.CasaService
import org.pin.backend.service.ImagenService
import org.pin.backend.service.PostItService
import org.pin.backend.service.TareaService
import org.slf4j.LoggerFactory
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/casas")
class CasaController(
    private val service: CasaService,
    private val tareaService: TareaService,
    private val casaRepository: CasaRepository,
    private val usuarioRepository: UsuarioRepository,
    private val listaRepository: ListaRepository,
    private val postItService: PostItService,
    private val imagenService: ImagenService,
    private val membershipValidator: CasaMembershipValidator,
) {
    private val logger = LoggerFactory.getLogger(CasaController::class.java)

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
        membershipValidator.validateMembership(casaId)
        val casa =
            casaRepository.findByIdWithListas(casaId)
                ?: return ResponseEntity.notFound().build()
        return ResponseEntity.ok(casa.listas.toList())
    }

    @GetMapping("/{id}/details")
    @Transactional(readOnly = true)
    fun getCasaDetails(
        @PathVariable id: Long,
    ): ResponseEntity<CasaDetailsResponseDTO> {
        membershipValidator.validateMembership(id)
        return casaRepository
            .findById(id)
            .map { casa ->
                ResponseEntity.ok(
                    CasaDetailsResponseDTO(
                        id = casa.id!!,
                        nombre = casa.nombre,
                        descripcion = casa.descripcion,
                    ),
                )
            }.orElse(ResponseEntity.notFound().build())
    }

    @DeleteMapping("/{casaId}/miembros/{usuarioId}")
    @Transactional
    fun removeMiembro(
        @PathVariable casaId: Long,
        @PathVariable usuarioId: Long,
    ): ResponseEntity<Unit> {
        membershipValidator.validateMembership(casaId)
        if (!service.removeMiembro(casaId, usuarioId)) {
            return ResponseEntity.notFound().build()
        }
        return ResponseEntity.ok().build()
    }

    @PostMapping("/{casaId}/listas")
    @Transactional
    fun crearListaEnCasa(
        @PathVariable casaId: Long,
        @RequestBody request: ListaRequestDTO,
    ): ResponseEntity<Lista> {
        membershipValidator.validateMembership(casaId)
        val casa =
            casaRepository.findById(casaId).orElse(null)
                ?: return ResponseEntity.notFound().build()

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
        @RequestParam(required = false) completado: Boolean?,
        @PageableDefault(size = 20, sort = ["fechaFin"], direction = Sort.Direction.ASC)
        pageable: Pageable,
    ): ResponseEntity<Page<TareaResponseDTO>> {
        membershipValidator.validateMembership(casaId)
        return ResponseEntity.ok(tareaService.getTareasByCasaId(casaId, completado, pageable))
    }

    @PostMapping("/{casaId}/tareas")
    @Transactional
    fun crearTareaEnCasa(
        @PathVariable casaId: Long,
        @RequestBody request: TareaRequestDTO,
    ): ResponseEntity<TareaResponseDTO> {
        membershipValidator.validateMembership(casaId)
        val response =
            tareaService.crearTareaEnCasa(casaId, request)
                ?: return ResponseEntity.notFound().build()
        return ResponseEntity.status(HttpStatus.CREATED).body(response)
    }

    @PostMapping("/{id}/{location}/postIt")
    fun crearPostIt(
        @PathVariable id: Long,
        @PathVariable location: String,
    ): ResponseEntity<PostItDTO> {
        membershipValidator.validateMembership(id)
        val casa = service.findById(id)
        if (casa.isPresent) {
            val postIt = postItService.new(casa.get(), location)
            casa.get().multimedia.add(postIt)
            service.save(casa.get())
            logger.info("$postIt ${postIt.id}")
            return ResponseEntity.ok(
                PostItDTO(
                    id = postIt.id!!,
                    lienzoId = postIt.lienzo?.id,
                    posicionX = postIt.posicionX,
                    posicionY = postIt.posicionY,
                    width = postIt.width,
                    height = postIt.height,
                    localizacion = postIt.localizacion,
                    tipo = postIt.tipo,
                    rutaAudio = postIt.rutaAudio,
                    colorNota = postIt.colorNota,
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
        membershipValidator.validateMembership(id)
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
                            id = it.id!!,
                            lienzoId = it.lienzo?.id,
                            posicionX = it.posicionX,
                            posicionY = it.posicionY,
                            width = it.width,
                            height = it.height,
                            localizacion = it.localizacion,
                            tipo = it.tipo ?: "DIBUJO",
                            rutaAudio = it.rutaAudio,
                            colorNota = it.colorNota,
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
        membershipValidator.validateMembership(id)
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
        membershipValidator.validateMembership(id)
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
    ): ResponseEntity<List<UsuarioDTO>> {
        membershipValidator.validateMembership(id)
        val casa =
            casaRepository.findByIdWithMiembros(id)
                ?: return ResponseEntity.notFound().build()
        return ResponseEntity.ok(casa.miembros.map { it.toDTO() })
    }

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
    fun getCasasDeUsuario(
        @PathVariable usuarioId: Long,
    ): ResponseEntity<List<CasaDTO>> {
        val casas = service.obtenerCasasDeUsuario(usuarioId)
        return ResponseEntity.ok(casas)
    }

    @GetMapping("/{casaId}/ranking")
    @Transactional(readOnly = true)
    fun getRankingCasa(
        @PathVariable casaId: Long,
    ): ResponseEntity<List<UsuarioRankingDTO>> {
        membershipValidator.validateMembership(casaId)
        val ranking =
            service.getRankingCasa(casaId)
                ?: return ResponseEntity.notFound().build()
        return ResponseEntity.ok(ranking)
    }
}
