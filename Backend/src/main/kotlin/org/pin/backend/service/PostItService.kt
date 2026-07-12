package org.pin.backend.service
import org.pin.backend.model.Casa
import org.pin.backend.model.PostIt
import org.pin.backend.repository.PostItRepository
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.nio.file.Files
import java.nio.file.Paths
import java.util.UUID

@Service
class PostItService(
    private val repo: PostItRepository,
    private val lienzoService: LienzoService,
) {
    fun findAll() = repo.findAll()

    fun getById(id: Long) = repo.findById(id)

    fun deleteById(id: Long) = repo.deleteById(id)

    fun save(postIt: PostIt): PostIt = repo.save(postIt)

    fun new(
        casa: Casa,
        location: String,
    ): PostIt {
        val p = PostIt()
        p.tipo = "DIBUJO"
        p.posicionX = 100f
        p.posicionY = 100f
        p.casa = casa
        p.lienzo = lienzoService.createDefaultPostIt()
        p.width = p.lienzo?.width?.toInt()!! / 3
        p.height = p.lienzo?.height?.toInt()!! / 3
        p.localizacion = location
        return repo.save(p)
    }

    fun newAudio(
        casa: Casa,
        location: String,
        file: MultipartFile,
    ): PostIt {
        val p = PostIt()
        p.tipo = "AUDIO"
        p.posicionX = 100f
        p.posicionY = 100f
        p.casa = casa
        p.width = 300
        p.height = 150
        p.localizacion = location

        val uploadDir = Paths.get("multimedia", "audios")
        if (!Files.exists(uploadDir)) {
            Files.createDirectories(uploadDir)
        }

        val extension = file.originalFilename?.substringAfterLast('.', "mp3") ?: "mp3"
        val fileName = "audio_${UUID.randomUUID()}.$extension"
        val filePath = uploadDir.resolve(fileName)

        Files.copy(file.inputStream, filePath)

        p.rutaAudio = "/multimedia/audios/$fileName"
        return repo.save(p)
    }
}
