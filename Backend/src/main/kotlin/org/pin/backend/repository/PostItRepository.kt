import org.springframework.data.jpa.repository.JpaRepository

interface PostItRepository : JpaRepository<PostIt, Long>