package org.pin.backend.repository
import org.pin.backend.model.PostIt
import org.springframework.data.jpa.repository.JpaRepository

interface PostItRepository : JpaRepository<PostIt, Long>
