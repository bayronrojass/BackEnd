# Changelog

All notable changes to the MiRumi Backend will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

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
