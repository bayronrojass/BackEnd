package org.pin.backend.security

import org.pin.backend.repository.CasaRepository
import org.pin.backend.security.services.UserDetailsImpl
import org.springframework.security.access.AccessDeniedException
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component

@Component
class CasaMembershipValidator(
    private val casaRepository: CasaRepository,
) {
    fun validateMembership(casaId: Long) {
        val userId = getAuthenticatedUserId()
        if (!casaRepository.isUserMember(casaId, userId)) {
            throw AccessDeniedException("User $userId is not a member of casa $casaId")
        }
    }

    fun getAuthenticatedUserId(): Long {
        val principal = SecurityContextHolder.getContext().authentication.principal as UserDetailsImpl
        return principal.id
    }
}
