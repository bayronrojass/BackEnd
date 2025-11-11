package org.pin.backend.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import java.util.*

@Service
class FileStorageService(
    @Value("\${multimedia_dir}") private var multimediaDir: String
) {
    private val uploadDir = Paths.get(multimediaDir)

    init {
        try {
            Files.createDirectories(uploadDir)
        } catch (e: Exception) {
            throw RuntimeException("No se pudo crear el directorio de subida", e)
        }
    }

    fun save(file: MultipartFile): String {
        val fileExtension = file.originalFilename?.substringAfterLast(".") ?: ""
        val uniqueFilename = "${UUID.randomUUID()}.$fileExtension"

        try {
            val targetPath = uploadDir.resolve(uniqueFilename)
            Files.copy(file.inputStream, targetPath, StandardCopyOption.REPLACE_EXISTING)
            return uniqueFilename
        } catch (e: Exception) {
            throw RuntimeException("No se pudo guardar el archivo: $uniqueFilename", e)
        }
    }
}
