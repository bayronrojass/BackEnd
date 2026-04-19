package org.pin.backend.service

import com.fasterxml.jackson.databind.ObjectMapper
import org.pin.backend.dto.Data.BorradorGastoDTO
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.multipart.MultipartFile
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import java.util.Base64

@Service
class GastoIAService(
    private val fileStorageService: FileStorageService,
    private val objectMapper: ObjectMapper
) {
    // CLAVES DE VERYFI
    private val clientId = "vrfJoMPoDgBZcYPnyyzhgWZiF5JTgTfg4zMpeMd"
    private val username = "bayronrojas30"
    private val apiKey = "0a42d0555296f17bb09de470eee81283"

    fun processarTicket(file: MultipartFile): BorradorGastoDTO {
        // 1. Guardar la foto
        val nombreArchivo = fileStorageService.save(file)
        val baseUrl = ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString()
        val urlPublica = "$baseUrl/multimedia/$nombreArchivo"

        try {
            // 2. Preparamos la imagen (Base64)
            val base64Image = Base64.getEncoder().encodeToString(file.bytes)
            val mimeType = file.contentType ?: "image/jpeg"
            val fileData = "data:$mimeType;base64,$base64Image"

            // 3. Conexión a la API de Veryfi
            val url = "https://api.veryfi.com/api/v8/partner/documents"
            val restTemplate = RestTemplate()

            // Cabeceras exactas que exige Veryfi
            val headers = HttpHeaders()
            headers.contentType = MediaType.APPLICATION_JSON
            headers.set("Accept", "application/json")
            headers.set("CLIENT-ID", clientId)
            headers.set("AUTHORIZATION", "apikey $username:$apiKey")

            // 4. Montamos el JSON de envío
            val bodyMap = mapOf(
                "file_name" to (file.originalFilename ?: "ticket.jpg"),
                "file_data" to fileData,
                "categories" to listOf("Grocery", "Utilities", "Meals")
            )
            val body = objectMapper.writeValueAsString(bodyMap)

            val entity = HttpEntity(body, headers)

            // 5. Enviamos el ticket a Veryfi
            val response = restTemplate.postForObject(url, entity, String::class.java)

            // 6. Extraemos los datos (Veryfi lo devuelve súper limpio)
            val rootNode = objectMapper.readTree(response)

            val vendorNode = rootNode.at("/vendor/name")
            val concepto = if (!vendorNode.isMissingNode && !vendorNode.isNull && vendorNode.asText().isNotBlank()) {
                vendorNode.asText().replaceFirstChar { it.uppercase() }
            } else {
                "Gasto Escaneado"
            }

            val totalNode = rootNode.at("/total")
            val total = if (!totalNode.isMissingNode && !totalNode.isNull) {
                totalNode.asDouble()
            } else {
                0.0
            }

            println("✅ VERYFI OK -> Comercio: $concepto | Total: $total")

            return BorradorGastoDTO(
                concepto = concepto,
                total = total,
                urlTicket = urlPublica
            )

        } catch (e: Exception) {
            println("❌ ERROR VERYFI: ${e.message}")
            return BorradorGastoDTO("Ticket Manual", 0.0, urlPublica)
        }
    }
}
