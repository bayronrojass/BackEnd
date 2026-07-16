# Changelog

All notable changes to the MiRumi Backend will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [0.5.0] - 2026-07-14 - Phase 4: Registration & UI consistency

### Added

- **`POST /api/auth/register` — new registration endpoint (`AuthController`)**: Accepts `RegistroRequest(nombre, correo, contrasena, fotoUrl?)` and returns the same `LoginResponse(authToken, flats, user)` shape as `/login` so the frontend can share auth-flow handling and auto-log-in on success. Password is hashed with the existing `BCryptPasswordEncoder` bean before persistence — plaintext never touches the DB. Validation:
  - Blank `nombre` / `correo` / `contrasena` → `400 Bad Request`.
  - Duplicate email (`usuarioRepository.findByCorreo(...).isPresent`) → `409 Conflict`.
  - New user starts with `puntosConvivencia = 0` and `flats = emptyList()` (they'll create or join a casa afterwards).
  - JWT minted via the existing `JwtService.generateToken(userId, email)` — same signing key + expiration as login.
- **`RegistroRequest` DTO** (`dto/Request/RegistroRequest.kt`) — 4-field data class matching the endpoint.

### Fixed

- **Login response was silently dropping `fotoUrl` (`AuthController.login`)**: Same category of bug we fixed in `TareaService` / `ListaService` under `[0.4.0]`. The login handler built `UsuarioDTO(id, nombre, correo)` (3-arg constructor, `fotoUrl` defaults to `null`), so a freshly-logged-in user never saw their own photo on the home screen — only after a subsequent `GET /usuarios/{id}` refresh. Replaced with the `Usuario.toDTO()` extension (which passes `fotoUrl` through). Drive-by fix while adding the register endpoint.

### Notes

- **`SecurityConfig` — no change needed**: `/api/auth/**` was already on `.permitAll()` from Phase 2's IDOR-hardening pass. The new endpoint drops straight through the security filter without any config change.
- **`AuthController.@RequestMapping()`**: Kept the class-level mapping empty (rather than migrating to `@RequestMapping("/api/auth")`) so the existing `POST /login` endpoint — which the current frontend and any external integrations hit at the wire root — stays unchanged. The new register handler carries its own full `/api/auth/register` path.

## [0.4.0] - 2026-07-13

### Added

- **Cursor-safe pagination on high-traffic list endpoints**: Introduced Spring Data `Pageable` across the read paths that previously returned unbounded collections. Repository methods now use JPQL with explicit `countQuery` for accurate `totalElements` / `totalPages`, and JOIN FETCH is restricted to single-valued (`@ManyToOne`) associations so Hibernate can push `LIMIT`/`OFFSET` to the database (no `HHH000104` in-memory paging).
  - `GET /casas/{casaId}/gastos` — expense history. Default: page size 20, sorted by `fechaInicio DESC` (newest first). Repo: `GastoRepository.findByCasaIdPaged(casaId, pageable)` — paged via `Casa.gastos` collection join since `Gasto` has no direct `casa` back-reference.
  - `GET /casas/{casaId}/tareas` — tasks board. Default: page size 20, sorted by `fechaFin ASC` (upcoming first). Optional `?completado=true|false` filter for the "completed tasks board" view. Repos: `TareaRepository.findByCasaIdPaged` and `findByCasaIdAndCompletadoPaged`.
- **Standard `Page<T>` response contract**: Both endpoints now return Spring's `Page<T>` JSON shape (`content`, `totalElements`, `totalPages`, `size`, `number`, `first`, `last`, `numberOfElements`, `empty`) instead of a bare JSON array. Consumers can drive infinite-scroll or classic pagination off `number` + `totalPages`.
- **Query parameters accepted by Spring**: `?page=N&size=N&sort=field,DIR` (repeat `sort` for multi-field). Defaults kick in when omitted, so existing frontend calls that pass no params still work — they just receive page 0.

### Changed

- **`Gasto.beneficiarios` — `@BatchSize(size = 30)`**: Added Hibernate batch loading on the `@ElementCollection` of beneficiary strings. Without this, a page of 20 gastos triggers 20 extra queries to hydrate beneficiarios (N+1 within the page); with it, Hibernate collapses those into a single `IN (…)` fetch. Keeps DB round-trips flat regardless of page size.
- **`GastoService.getGastosByCasaId(casaId, pageable)`**: New paginated overload replacing the unbounded list variant. Returns `Page<GastoResponseDTO>` via `Page.map` (streams the transform without materializing the full result set).
- **`TareaService.getTareasByCasaId(casaId, completado, pageable)`**: New paginated overload with optional completion filter. Delegates to the appropriate repo method based on whether `completado` is supplied.

### Fixed

- **`GastoRepository.findByCasaIdPaged` — wrong sort alias (400 Bad Request)**: The initial JPQL query `SELECT g FROM Casa c JOIN c.gastos g …` put `Casa` as the first FROM alias, so Spring Data attached the `Pageable` sort to `c` and generated `ORDER BY c.fechaInicio DESC` — but `fechaInicio` lives on `Gasto`, not `Casa`. Rewrote as `SELECT g FROM Gasto g LEFT JOIN FETCH g.pagadoPor WHERE g IN (SELECT gc FROM Casa c JOIN c.gastos gc WHERE c.id = :casaId)` so `Gasto` is the primary root and the sort correctly targets `g.fechaInicio`. Same restructure applied to the `countQuery`.
- **Jackson infinite recursion on `GET /casas/{casaId}/listas` (Max Nesting Depth Exceeded)**: The response returns `List<Lista>` directly and Jackson followed the cycle `Lista.propietario (Usuario) → Usuario.casas (Set<Casa>) → Casa.listas → Lista → …`. `Lista.casa` already carried `@JsonIgnore`, but the inverse-side collections on `Usuario` were unprotected. Annotated the four back-reference collections on `Usuario` with `@JsonIgnore`:
  - `Usuario.casas` — breaks the primary reported cycle
  - `Usuario.casasAdministradas` — breaks the parallel admin cycle via `Casa.administradores`
  - `Usuario.tokens` — Firebase tokens are internal auth state, never belong in list responses
  - `Usuario.logrosProgreso` — achievements are served by a dedicated endpoint and should not leak into every Usuario serialization
  - JPA fetch semantics are unchanged; only the JSON view is filtered. Endpoints that intentionally expose these collections (if any) must switch to explicit DTO mapping.
- **Profile / ranking avatars silently 401 (`SecurityConfig`)**: The `/multimedia/**` resource handler (which serves user photos and ticket images) was falling through the `.anyRequest().authenticated()` catch-all in `SecurityConfig`. Coil, on Android, fires its own HTTP requests entirely outside Retrofit — it never passes through `AuthInterceptor` and never attaches the `Bearer` token — so every image GET was returning `401 Unauthorized` and rendering as the fallback letter placeholder. Added an explicit `.requestMatchers("/multimedia/**").permitAll()` rule ahead of the catch-all. Public read access is intended for these files: they are user-uploaded avatars and expense tickets referenced by opaque UUID filenames.
- **`UsuarioService` query redundancy on photo update (3 SELECTs collapsed to 1)**: The service had no `@Transactional`, so `findById(id)` opened and closed its own tx, and the returned entity became **detached**. The subsequent `usuarioRepository.save(usuario)` then opened a *second* tx, ran `merge()` — which fires an extra SELECT to load the current row before UPDATE — and closed. That produced the log's redundant `select … from usuario where id=?` pattern. Annotated `UsuarioService` `@Transactional` (class-level) with `@Transactional(readOnly = true)` on `findAll` for the query-only path. Removed the now-unnecessary explicit `save()` call — the entity is managed inside the transaction, so field mutation is dirty-tracked and a single `UPDATE` fires on commit. Applied to both `actualizarFotoPerfil` and `eliminarFotoPerfil`. Result: 1 SELECT (findById) + 1 UPDATE — plus the unavoidable auth-filter SELECT that Spring Security itself performs to hydrate the principal.
- **`fotoUrl` silently dropped from Tarea / Lista responses**: Multiple service DTO builders were constructing `UsuarioDTO(it.id!!, it.nombre, it.correo)` with the 3-arg constructor — which is legal Kotlin because `UsuarioDTO.fotoUrl` has a `null` default — but it meant every task assignee and every list participant landed on the client with `fotoUrl = null`, so the Android app fell back to the initial-letter placeholder even after the `/multimedia/**` permitAll fix. Fixed the call sites so the `fotoUrl` propagates end-to-end:
  - `TareaService.toResponseDTO` — routes `tarea.asignadoA` through the existing `Usuario.toDTO()` extension (which was already correct), covering every read path that emits `TareaResponseDTO` (list, create, update, complete, paged, etc.).
  - `ListaService.convertirADTO` — both `propietario` and each `participante` now pass `it.fotoUrl` explicitly to the 4-arg `UsuarioDTO` constructor.

### Added (Post-It customization)

- **`PostIt.colorNota: String?` field** — nullable hex-string column (e.g. `#FFF9C4`) that stores the pastel background color chosen from the new "Color de la nota" selector in the expanded drawing view. Nullable so legacy post-its default to yellow on the client, and so the AUDIO/IMAGEN subtypes (which don't have a note surface) leave the field empty.
- **`PostItDTO.colorNota: String? = null`** — new field with a default so every existing call site (`PostItController.getById`, `createAudioPostIt`, and the two named-arg constructions in `CasaController.crearPostIt` / `getPostIt`) keeps compiling. Every construction site was updated to explicitly pass `postIt.colorNota` so the value round-trips end-to-end.
- **`PUT /postits/{id}/color-nota` endpoint** — accepts the raw hex string in the body, sets it on the entity (blank body clears the field, so the client can fall back to yellow), and persists via the existing `PostItService.save`. Guarded by `Multimedia`-instance-of-`PostIt` check so an ImagenDTO id can't accidentally hit this path.
- **Deferred**: an assignee relation on PostIt (`asignadoA: Usuario?` — the "Enviar nota a" chip target from the mockup) is intentionally NOT in this pass. Adding it requires a new nullable FK column + new query paths + DTO surface + notification wiring — larger than colorNota. The frontend chip is in-memory-only for now; documented as follow-up.

### Fixed (post-release palette alignment)

- **`Lienzo4bpp.palette` mismatched the client brush byte codes (color mutation bug)**: strokes drawn as (say) Yellow on the phone re-rendered as Black once the server composited them and the phone re-fetched the bitmap. Root cause: `LienzoService.applyDelta` uses `PointDeltaDTO.color: Byte` as a direct index into `Lienzo4bpp.palette`, but the client's `PizarraView.createPaint` had been updated to the new 7-color design mockup palette (`1=Yellow, 2=Green, 3=Blue, 4=Purple, 5=Fuchsia, 6=Black, 7=White`) while the server palette was still the legacy `[transparent, black, red, green, blue, yellow, magenta, cyan, white]`. Every stroke silently mapped to the wrong slot on server-side compositing (client Fuchsia=5 → server yellow, client Black=6 → server magenta, etc.).
  - **Fix**: realigned the backend `Lienzo4bpp.palette` array so indices 1-7 hold the exact ARGB values the client renders with — `#FBC02D, #388E3C, #1976D2, #673AB7, #E91E63, #000000, #FFFFFF`. Index 0 stays transparent for the fill-nothing sentinel; index 8 is now a white-duplicate padding slot kept only to preserve the 9-entry array size that the compact 4bpp encoding assumes.
  - Added a big comment on the palette declaration warning future editors that the array is a wire contract with the Android client: **any drift silently repaints strokes**.
  - **Data migration note**: existing lienzo 4bpp byte-arrays in the database were encoded with the OLD palette indices. Since only the palette's ARGB values changed (not the indices themselves), any historical stroke that was, say, "server-side red" (index 2) will now decode as "green" (index 2's new color). This IS a visual break for pre-existing drawings, deemed acceptable pre-1.0 — dev data is disposable. Post-launch a proper migration would need to re-map each byte in every stored `Lienzo.bytes` from the old→new index assignment.

### Added (server-side canvas clear)

- **`PUT /lienzos/{id}/clear` — new endpoint** (`LienzoController`) that wipes the server-composited bitmap for a lienzo to a blank white surface. Complements the frontend's `PizarraView.clearCanvas` so the "Borrar" button is truly permanent: no ghost strokes resurrect from the server's composited bitmap on the next `applyDelta` (previously the server would composite the next stroke ON TOP of the pre-clear bitmap) or on the next poll fetch (previously returning the old bytes).
- **`LienzoService.clearLienzo(id)` — new service method** that fetches the entity, allocates a `BufferedImage` of the stored `lienzo.width × lienzo.height`, fills with `java.awt.Color.WHITE` (matches the client's `Bitmap.eraseColor(Color.WHITE)` in `PizarraView.clearCanvas`), re-encodes via `Lienzo4bpp.encodeImage`, refreshes `lastEdited = Instant.now()` so any peer client's `isUpdated` poll picks up the change immediately, compresses, saves. Returns `ResponseEntity<Boolean>` — `404` on unknown id, `200 true` on success.
- **White (not transparent)**: `createDefaultPostIt` uses a transparent fill for freshly-created post-its; `clearLienzo` deliberately uses WHITE to match what the user visually expects from the "Borrar" button (they see a blank white canvas locally — server must match). Subsequent strokes composite onto white, preserving color fidelity.

### Notes

- **Frontend contract change (breaking)**: Response shape for the two endpoints changes from `[…]` to `{ content: […], totalElements, totalPages, size, number, … }`. Android `RepositoryGasto` and task board Repositories must be updated to unwrap `.content` (follow-up frontend task, not included in this backend release).
- **`CasaRepository.findByIdWithGastos` retained**: Still used by `PdfService.generarResumenGastosPdf` to load the full expense list for the summary PDF (a one-off, admin-triggered export where full materialization is intentional).

## [0.3.0] - 2026-07-12

### Security

- **Externalized Veryfi OCR credentials**: Removed hardcoded `clientId`, `username`, and `apiKey` from `GastoIAService.kt`. Credentials are now injected via `@Value` from `application.properties` with environment variable placeholders (`VERYFI_CLIENT_ID`, `VERYFI_USERNAME`, `VERYFI_API_KEY`). Empty defaults ensure the app starts safely without the vars set (OCR gracefully falls back to "Ticket Manual").
- **IDOR Protection (resource ownership enforcement)**: Created `CasaMembershipValidator` component that verifies the authenticated user (from JWT/SecurityContext) is a member of the target casa before any operation proceeds. Uses an efficient `EXISTS` query (`CasaRepository.isUserMember`) — no entity loading. Throws Spring Security `AccessDeniedException` (HTTP 403) on unauthorized access. Applied across all casa-scoped endpoints:
  - `GastoController`: 6 endpoints (list, create, edit, foto upload, foto delete, PDF)
  - `CasaController`: 12 endpoints (listas, details, remove member, create lista, tareas, create tarea, postIt CRUD, imagenes, miembros, ranking)
  - `EventoController`: 2 endpoints (list, create)
  - `EncuestaController`: 2 endpoints (list, create)
  - `ListaController`: 2 endpoints (list, create)
  - `PostItController`: 1 endpoint (audio upload)
  - `TareaController`: 1 endpoint (reparto inteligente)
  - Deliberately excluded: `joinCasa` (user is joining, not yet a member)

### Changed

- **GastoIAService**: Refactored from body-level hardcoded fields to constructor-injected `@Value` properties, following the same externalization pattern used by JWT and datasource config.
- **Service-layer refactoring (thin controllers, fat services)**: Extracted all business logic from controllers into dedicated `@Service` classes, enforcing clean separation of concerns and enabling unit-testable domain logic:
  - `GastoService` (NEW): Extracted entity creation, category validation, DTO mapping, beneficiarios management, and photo URL construction from `GastoController`. Controller reduced from 218 LOC to 117 LOC.
  - `TareaService` (EXPANDED): Extracted task update/delete/complete/notify/vote/reparto logic from `TareaController`. Includes periodic rotation, assignment rules (`-1L` = unassign), delay calculation for logro processing, and Firebase notifications. Controller reduced from 247 LOC to 89 LOC.
  - `EventoService` (EXPANDED): Extracted DTO mapping, event deletion (replaced catastrophic `findAll().find{}` scan with `findByEventosContains` query), and event update from `EventoController`. Controller reduced from 168 LOC to 79 LOC.
  - `CasaService` (EXPANDED): Extracted `removeMiembro` and `getRankingCasa` business logic from `CasaController`.
  - `CasaController` now delegates `getTareasByCasaId` and `crearTareaEnCasa` to `TareaService`, removing direct repository access and inline DTO mapping.

### Fixed

- **EventoController.borrarEvento performance bug**: Replaced `casaRepository.findAll().find { casa -> casa.eventos.any { it.id == eventoId } }` (full table scan loading ALL casas into memory) with `casaRepository.findByEventosContains(evento)` (single indexed query). This was a latent O(n) scan that would degrade linearly with the number of casas in the system.

## [0.2.0] - 2026-07-12

### Changed

- **Monetary Precision (BigDecimal Refactor)**: Replaced `Double` with `BigDecimal` across the entire expense pipeline.
  - `Gasto.importe`: `Double` → `BigDecimal` with `@Column(precision = 10, scale = 2)` mapping to PostgreSQL `numeric(10,2)`.
  - `GastoRequestDTO.importe`, `GastoResponseDTO.importe`, `BorradorGastoDTO.total`: all migrated to `BigDecimal`.
  - `GastoIAService` (Veryfi OCR): parses ticket totals via `decimalValue()` instead of `asDouble()`.
  - `PdfService`: expense summation uses `BigDecimal.fold()` for exact arithmetic.
- **Transactional Boundaries**: Added `@Transactional` to `CasaService` (class-level) with `readOnly = true` on query methods. Added `@Transactional(readOnly = true)` to `PagoService`.
- **N+1 Query Elimination**: Replaced `findById()` with dedicated `JOIN FETCH` queries across repositories, reducing every read endpoint to a single database round-trip:
  - `CasaRepository.findByIdWithGastos`: fetches gastos + pagadoPor + beneficiarios in one query.
  - `CasaRepository.findByIdWithTareas`: fetches tareas + asignadoA in one query.
  - `CasaRepository.findByIdWithMiembros`: fetches miembros in one query.
  - `CasaRepository.findByIdWithListas`: fetches listas + propietario + participantes in one query.
  - `CasaRepository.findByIdWithEventos`: fetches eventos + creadoPor + asistentes in one query.
  - `ListaRepository.findByCasaIdWithDetails`: fetches listas + propietario + participantes by casa ID (service-layer path).
  - `EncuestaRepository.findByCasaIdWithDetails`: fetches encuestas + creador + opciones + votos + votante in one query.
- **Encuesta Route Standardization**: Refactored `EncuestaController` from legacy `/api/casa/{casaId}/lista-encuestas` to RESTful `/casas/{casaId}/encuestas`. Voting and close actions moved to `/casas/encuestas/{id}/votar/{opcionId}` and `/casas/encuestas/{id}/cerrar`.

### Fixed

- **MultipleBagFetchException (full elimination)**: Migrated all `MutableList` entity collections to `MutableSet` across the entire domain model. Hibernate cannot simultaneously JOIN FETCH two bag-typed collections; Set semantics resolve this cleanly and prevent the exception from resurfacing on any future multi-fetch query.
  - `Casa`: gastos, multimedia, listas, eventos, tareas, encuestas.
  - `Gasto`: beneficiarios, pagos.
  - `Lista`: participantes, elementos.
  - `Encuesta`: opciones.
  - `Opcion`: votos.
  - `Evento`: asistentes.
  - `Usuario`: logrosProgreso.

### Security

- **Eliminated X-User-Id header IDOR vulnerability**: `EncuestaController` no longer trusts a client-supplied `X-User-Id` header. User identity is extracted from the authenticated `SecurityContextHolder` principal (`UserDetailsImpl`) populated by `JwtAuthenticationFilter`.

### Added

- **Engineering Baseline**: `CHANGELOG.md`, `CONTRIBUTING.md` (Conventional Commits), `detekt.yml` (static analysis configuration referenced by pom.xml but previously missing).

## [0.1.0] - 2026-07-12

### Added

- **JWT Authentication Layer**: Stateless token-based authentication using jjwt 0.11.5 (HS256 signing).
  - `JwtService` for token generation, validation, and claim extraction.
  - `JwtAuthenticationFilter` (OncePerRequestFilter) that extracts Bearer tokens, validates them, and populates the SecurityContext.
  - Configurable secret and expiration via `jwt.secret` and `jwt.expiration-ms` properties.
- **Spring Security Configuration**: Locked-down `SecurityConfig` replacing the previous `permitAll()` setup.
  - Stateless session management (`SessionCreationPolicy.STATELESS`).
  - `/login` and `/api/auth/**` are public; all other endpoints require authentication.
  - JWT filter integrated before `UsernamePasswordAuthenticationFilter`.
- **Password Migration Utility**: `PasswordMigrator` ApplicationRunner that detects plaintext passwords in the database and hashes them with BCrypt on startup.
- **Spring Data REST Suppression**: `spring.data.rest.detection-strategy=annotated` to prevent automatic repository endpoint exposure.

### Changed

- **AuthController**: Login endpoint now validates passwords with BCrypt and returns a cryptographically signed JWT instead of a hardcoded fake token.
- **Usuario Entity**: Added `@JsonIgnore` on `contrasena` field to prevent password leakage in JSON serialization.

### Security

- All API endpoints now require a valid JWT Bearer token (except login).
- Passwords stored exclusively as BCrypt hashes; plaintext passwords auto-migrated on boot.
- Sensitive fields excluded from all JSON responses.

## [0.0.1] - 2026-06-01

### Added

- Initial Spring Boot 3.3.6 + Kotlin backend.
- JPA entities: Usuario, Casa, Tarea, Evento, Lista, Elemento, Gasto, Invitacion, Encuesta, Voto, Pizarra, Multimedia, FirebaseToken.
- REST controllers for all domain entities.
- PostgreSQL datasource with Hibernate `create-drop` DDL mode.
- Seed data via `import.sql`.
- Firebase Cloud Messaging token registration.
- Multipart file upload for user photos and multimedia.
