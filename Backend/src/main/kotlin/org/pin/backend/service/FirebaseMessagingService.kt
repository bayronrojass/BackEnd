package org.pin.backend.service

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.Message
import com.google.firebase.messaging.Notification
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.io.File
import java.io.FileInputStream
import javax.annotation.PostConstruct

@Service
class FirebaseMessagingService {
    private lateinit var firebaseTokenService: FirebaseTokenService
    private val logger: Logger = LoggerFactory.getLogger(LienzoService::class.java)

    @PostConstruct
    fun inicializar() {
        val nombreArchivo = "firebase-config.json" // El nombre corto que pusimos en Docker

        val file = File(System.getenv("FCM_CREDENTIALS_PATH") ?: nombreArchivo)
        val finalFile = if (file.exists()) file else File("Backend/mirumi-23884-firebase-adminsdk-fbsvc-ce13046c20.json")
        val serviceAccount = FileInputStream(finalFile)

        val options =
            FirebaseOptions
                .builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build()

        if (FirebaseApp.getApps().isEmpty()) {
            FirebaseApp.initializeApp(options)
        }
    }

    fun enviarAUsuario(
        usuarioId: Long,
        titulo: String,
        cuerpo: String,
    ) {
        val tokens = firebaseTokenService.getTokens(usuarioId)
        for (token in tokens) {
            enviar(token, titulo, cuerpo)
        }
    }

    fun enviar(
        tokenDestino: String,
        titulo: String,
        cuerpo: String,
    ) {
        val message =
            Message
                .builder()
                .setNotification(
                    Notification
                        .builder()
                        .setTitle(titulo)
                        .setBody(cuerpo)
                        .build(),
                ).setToken(tokenDestino)
                .build()

        try {
            val response = FirebaseMessaging.getInstance().send(message)
            logger.info("Mensaje enviado exitosamente: $response")
        } catch (e: Exception) {
            logger.info("Error al enviar mensaje: ${e.message}")
            e.printStackTrace()
        }
    }
}
