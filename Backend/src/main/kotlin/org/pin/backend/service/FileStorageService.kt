package org.pin.backend.service

import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import java.util.*

@Service
class FileStorageService {
    // Define el directorio donde se guardarán las subidas
    private val uploadDir = Paths.get("./uploads")

    init {
        try {
            // Crea el directorio si no existe
            Files.createDirectories(uploadDir)
        } catch (e: Exception) {
            throw RuntimeException("No se pudo crear el directorio de subida", e)
        }
    }

    fun save(file: MultipartFile): String {
        // Genera un nombre de archivo único para evitar colisiones
        val fileExtension = file.originalFilename?.substringAfterLast(".") ?: ""
        val uniqueFilename = "${UUID.randomUUID()}.$fileExtension"

        try {
            val targetPath = uploadDir.resolve(uniqueFilename)
            // Copia el archivo al directorio de destino
            Files.copy(file.inputStream, targetPath, StandardCopyOption.REPLACE_EXISTING)

            // Devuelve el nombre del archivo (o la ruta) que guardarás en la BD
            return uniqueFilename
        } catch (e: Exception) {
            throw RuntimeException("No se pudo guardar el archivo: $uniqueFilename", e)
        }
    }
}
