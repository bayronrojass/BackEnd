package org.pin.backend.service
import org.pin.backend.model.Casa
import org.pin.backend.model.PostIt
import org.pin.backend.repository.PostItRepository
import org.springframework.stereotype.Service

@Service
class PostItService(
    private val repo: PostItRepository,
    private val lienzoService: LienzoService,
) {
    fun findAll() = repo.findAll()

    fun getById(id: Long) = repo.findById(id)

    fun deleteById(id: Long) = repo.deleteById(id)

    fun save(postIt: PostIt): PostIt = repo.save(postIt)

    fun new(casa: Casa): PostIt {
        val p = PostIt()
        p.posicionX = 100f
        p.posicionY = 100f
        p.casa = casa
        p.lienzo = lienzoService.createDefaultPostIt()
        p.width = p.lienzo?.width?.toInt()!! / 3
        p.height = p.lienzo?.height?.toInt()!! / 3
        return repo.save(p)
    }
}
