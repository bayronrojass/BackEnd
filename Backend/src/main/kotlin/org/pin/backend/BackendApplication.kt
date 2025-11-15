package org.pin.backend

import jakarta.annotation.PostConstruct
import org.eclipse.paho.client.mqttv3.MqttException
import org.pin.backend.service.MqttService // Importa el servicio
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

private val logger: Logger = LoggerFactory.getLogger(BackendApplication::class.java)

/**
 * ¡CORREGIDO!
 * Se ha eliminado el 'scanBasePackages' para que Spring pueda
 * encontrar automáticamente tu 'SecurityConfig' en 'org.pin.backend.configs'
 * y tu 'AuthTokenFilter' en 'org.pin.backend.security.jwt'.
 */
@SpringBootApplication
class BackendApplication(
    // Inyecta el MqttService real gestionado por Spring
    private val mqttService: MqttService,
) {
    /**
     * ¡CORREGIDO!
     * Movido 'post()' DENTRO de la clase para que @PostConstruct funcione
     * y se use el servicio MqttService inyectado.
     */
    @PostConstruct
    fun post() {
        try {
            // El servicio MQTT ya se conecta solo al ser creado.
            // Puedes usar esto para enviar un mensaje de prueba si quieres.
            logger.info("MqttService inyectado y listo.")
            // mqttService.sendToUser(0, "TEST DE ARRANQUE")
        } catch (e: MqttException) {
            logger.error("Error en el PostConstruct de Mqtt: ${e.message}")
        }
    }
}

fun main(args: Array<String>) {
    runApplication<BackendApplication>(*args)
}
