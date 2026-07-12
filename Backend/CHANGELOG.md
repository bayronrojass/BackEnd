# Changelog

All notable changes to the MiRumi Backend will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

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
