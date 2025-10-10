package org.pin.backend.service

import org.eclipse.paho.client.mqttv3.MqttClient
import org.eclipse.paho.client.mqttv3.MqttConnectOptions
import org.eclipse.paho.client.mqttv3.MqttException
import org.eclipse.paho.client.mqttv3.MqttMessage
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class MqttService(
    @Value("\${MQTT_VALUE}") private val brokerUrl: String
) {

    private val logger: Logger = LoggerFactory.getLogger(MqttService::class.java)
    private var client: MqttClient = MqttClient(brokerUrl, MqttClient.generateClientId());

    init {
        connectWithRetry()
    }

    private fun connectWithRetry() {
        val options = MqttConnectOptions().apply {
            isAutomaticReconnect = true
            isCleanSession = true
            connectionTimeout = 10
            keepAliveInterval = 30
        }

        repeat(5) { attempt ->
            try {
                logger.info("🔌 Intentando conectar a $brokerUrl (intento ${attempt + 1})")
                client.connect(options)
                if (client.isConnected) {
                    logger.info("Conectado correctamente a $brokerUrl")
                    return
                }
            } catch (e: MqttException) {
                logger.warn("Falló conexión MQTT: ${e.message}")
                Thread.sleep(3000)
            }
        }

        logger.error("No se pudo conectar tras varios intentos")
    }

    fun send(topic: String, message: String) {
        if (!client.isConnected) {
            logger.warn("Cliente MQTT no conectado, intentando reconectar...")
            connectWithRetry()
        }

        if (client.isConnected) {
            val msg = MqttMessage(message.toByteArray())
            msg.qos = 1
            client.publish(topic, msg)
        }
        else{
            logger.error("Cliente MQTT falló al conectarse...")
        }
    }

    public fun sendToUser(userId: Int, message: String) {
        send("usuario/$userId", message);
    }
}