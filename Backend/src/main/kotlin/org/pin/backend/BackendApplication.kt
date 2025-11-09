package org.pin.backend

import jakarta.annotation.PostConstruct
import org.eclipse.paho.client.mqttv3.MqttException
import org.pin.backend.service.MqttService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

private val logger: Logger = LoggerFactory.getLogger(BackendApplication::class.java)

@SpringBootApplication(scanBasePackages = ["org.pin.backend", "org.pin.backend.controller"])
class BackendApplication

fun main(args: Array<String>) {
    runApplication<BackendApplication>(*args)
}

@PostConstruct
fun post() {
    try {
        val service = MqttService("")
        service.sendToUser(0, "TEST")
    } catch (e: MqttException) {
        logger.error(e.message)
    }
}
