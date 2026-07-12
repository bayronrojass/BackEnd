# Contributing to MiRumi Backend

## Commit Convention

This project uses [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/).

### Format

```
<type>(<scope>): <description>

[optional body]

[optional footer(s)]
```

### Types

| Type       | Description                                           |
|------------|-------------------------------------------------------|
| `feat`     | A new feature or capability                           |
| `fix`      | A bug fix                                             |
| `refactor` | Code restructuring without behavior change            |
| `perf`     | Performance improvement                               |
| `security` | Security hardening or vulnerability fix               |
| `test`     | Adding or updating tests                              |
| `docs`     | Documentation changes                                 |
| `build`    | Build system or dependency changes                    |
| `ci`       | CI/CD pipeline changes                                |
| `chore`    | Maintenance tasks that don't fit other categories     |

### Scopes

| Scope        | Covers                                              |
|--------------|-----------------------------------------------------|
| `auth`       | Authentication, JWT, login, SecurityConfig          |
| `security`   | Password hashing, field hiding, access control      |
| `api`        | REST controllers, endpoints, DTOs                   |
| `model`      | JPA entities, relationships                         |
| `service`    | Business logic layer                                |
| `config`     | Application properties, Spring configuration        |
| `db`         | Database schema, migrations, seed data              |
| `firebase`   | FCM token management, push notifications            |
| `deps`       | Dependency updates                                  |

### Examples

```
feat(auth): add JWT token generation and validation service
fix(security): prevent password leakage in JSON serialization
refactor(api): extract DTO mapping to extension functions
test(service): add unit tests for TareaService
build(deps): upgrade Spring Boot to 3.3.7
```

### Rules

1. Use imperative mood in the description ("add feature" not "added feature").
2. Do not capitalize the first letter of the description.
3. No period at the end of the description.
4. Limit the subject line to 72 characters.
5. Use the body to explain *what* and *why*, not *how*.
6. Reference issue numbers in the footer: `Closes #42`.

## Code Style

- **Formatter**: Ktlint runs automatically during build (`ktlint-maven-plugin`).
- **Static Analysis**: Detekt runs during `verify` phase; fix all reported issues before pushing.
- **EditorConfig**: The `.editorconfig` at project root enforces indentation and line length.

Run formatting manually:

```bash
./mvnw ktlint:format
```

Run static analysis:

```bash
./mvnw detekt:check
```

## Branch Strategy

- `main` — stable, deployable code.
- `develop` — integration branch for features.
- Feature branches: `feat/<scope>-<short-description>` (e.g., `feat/auth-jwt-refresh`).
- Fix branches: `fix/<scope>-<short-description>` (e.g., `fix/security-token-expiry`).
