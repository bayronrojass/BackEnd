# Changelog

All notable changes to the MiRumi Backend will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

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
