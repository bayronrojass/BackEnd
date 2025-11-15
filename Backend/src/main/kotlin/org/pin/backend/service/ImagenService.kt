package org.pin.backend.service
import org.pin.backend.model.Casa
import org.pin.backend.model.Imagen
import org.pin.backend.repository.ImagenRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.awt.Graphics2D
import java.awt.RenderingHints
import java.awt.image.BufferedImage
import java.util.*
import javax.imageio.ImageIO

@Service
class ImagenService(
    private val repo: ImagenRepository,
    private val lienzoService: LienzoService,
) {
    private val logger: Logger = LoggerFactory.getLogger(ImagenService::class.java)

    fun findAll() = repo.findAll()

    fun getById(id: Long) = repo.findById(id)

    fun deleteById(id: Long) = repo.deleteById(id)

    fun save(imagen: Imagen): Imagen = repo.save(imagen)

    fun new(
        casa: Casa,
        file: MultipartFile,
    ): Optional<Imagen> {
        val image: BufferedImage? =
            try {
                ImageIO.read(file.inputStream)
            } catch (e: Exception) {
                logger.error("Error while reading image {}\n{}", e, e.message)
                null
            }

        if (image == null) {
            return Optional.empty<Imagen>()
        }
        val fileExtension = file.originalFilename?.substringAfterLast(".") ?: ""
        val scaledImage = resizeImage(image)
        logger.info("Tamaños {} {}", image.width, scaledImage.width)
        val i = Imagen()
        i.posicionX = 100f
        i.posicionY = 100f
        i.casa = casa
        i.lienzo = lienzoService.createFromImage(scaledImage, fileExtension)
        i.width = scaledImage.width
        i.height = scaledImage.height
        return Optional.of(repo.save(i))
    }

    fun resizeImage(
        original: BufferedImage,
        minWidth: Int = 300,
        maxWidth: Int = 500,
        maxHeight: Int = 800,
    ): BufferedImage {
        var width = original.width
        var height = original.height

        if (width < minWidth) {
            val ratio = minWidth.toDouble() / width
            width = minWidth
            height = (height * ratio).toInt()
        } else if (width > maxWidth) {
            val ratio = maxWidth.toDouble() / width
            width = maxWidth
            height = (height * ratio).toInt()
        }

        if (height > maxHeight) {
            val ratio = maxHeight.toDouble() / height
            height = maxHeight
            width = (width * ratio).toInt()
        }

        val resized = BufferedImage(width, height, original.type)
        val g2d: Graphics2D = resized.createGraphics()
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR)
        g2d.drawImage(original, 0, 0, width, height, null)
        g2d.dispose()

        return resized
    }
}
