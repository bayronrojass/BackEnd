package org.pin.backend.controller

import org.pin.backend.service.InvitacionService
import org.pin.backend.service.MqttService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/mqtt")
class MqttTestController(
    private val service: MqttService,
) {
    @PostMapping("/test")
    fun test() = service.sendToUser(0, "TEST");
}
