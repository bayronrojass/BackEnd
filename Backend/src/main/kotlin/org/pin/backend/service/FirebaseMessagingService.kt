package org.pin.backend.service

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.Message
import com.google.firebase.messaging.Notification
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Lazy
import org.springframework.core.io.ClassPathResource
import org.springframework.stereotype.Service
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import javax.annotation.PostConstruct

@Service
class FirebaseMessagingService {

    @Autowired
    @Lazy // Rompe la dependencia circular cargando el bean solo cuando se necesita
    private lateinit var firebaseTokenService: FirebaseTokenService

    // Corregido el Logger para que apunte a esta clase y no a LienzoService
    private val logger: Logger = LoggerFactory.getLogger(FirebaseMessagingService::class.java)

    @PostConstruct
    fun inicializar() {
        val nombreArchivo = "firebase-config.json"
        var serviceAccountStream: InputStream? = null

        try {
            // 1. Intentar cargar desde variable de entorno (Ruta absoluta)
            val envPath = System.getenv("FCM_CREDENTIALS_PATH")
            if (!envPath.isNullOrEmpty()) {
                val file = File(envPath)
                if (file.exists()) {
                    serviceAccountStream = FileInputStream(file)
                    logger.info("Cargando configuración desde variable de entorno: $envPath")
                }
            }

            // 2. Intentar cargar desde el directorio de trabajo (Raíz del proyecto)
            if (serviceAccountStream == null) {
                val file = File(nombreArchivo)
                if (file.exists()) {
                    serviceAccountStream = FileInputStream(file)
                    logger.info("Cargando configuración desde directorio raíz: ${file.absolutePath}")
                }
            }

            // 3. Intentar cargar desde el Classpath (src/main/resources) - RECOMENDADO
            if (serviceAccountStream == null) {
                val resource = ClassPathResource(nombreArchivo)
                if (resource.exists()) {
                    serviceAccountStream = resource.inputStream
                    logger.info("Cargando configuración desde resources (classpath)")
                }
            }

            // Si falla todo, lanzar error
            if (serviceAccountStream == null) {
                throw RuntimeException("No se encontró el archivo $nombreArchivo. Ponlo en la raíz del proyecto o en src/main/resources.")
            }

            val options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccountStream))
                .build()

            if (FirebaseApp.getApps().isEmpty()) {
                FirebaseApp.initializeApp(options)
                logger.info("Firebase inicializado correctamente.")
            }

        } catch (e: Exception) {
            logger.error("Error crítico al inicializar Firebase: ${e.message}")
            throw e // Relanzar para que Spring se detenga si esto falla
        }
    }

    fun enviarAUsuario(
        usuarioId: Long,
        titulo: String,
        cuerpo: String,
    ) {
        // Aseguramos manejo de errores si el servicio de tokens falla o devuelve lista vacía
        try {
            val tokens = firebaseTokenService.getTokens(usuarioId)
            if (tokens.isEmpty()) {
                logger.warn("No se encontraron tokens FCM para el usuario $usuarioId")
                return
            }
            for (token in tokens) {
                enviar(token, titulo, cuerpo)
            }
        } catch (e: Exception) {
            logger.error("Error recuperando tokens para usuario $usuarioId: ${e.message}")
        }
    }

    fun enviar(
        tokenDestino: String,
        titulo: String,
        cuerpo: String,
    ) {
        val message = Message.builder()
            .setNotification(
                Notification.builder()
                    .setTitle(titulo)
                    .setBody(cuerpo)
                    .build(),
            )
            .setToken(tokenDestino)
            .build()

        try {
            val response = FirebaseMessaging.getInstance().send(message)
            logger.info("Notificación enviada: $response")
        } catch (e: Exception) {
            logger.error("Error al enviar notificación FCM: ${e.message}")
        }
    }
}
