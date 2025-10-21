package org.pin.backend.controller
import org.pin.backend.dto.PointDeltaDTO
import org.pin.backend.service.LienzoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/lienzos")
class LienzoController(
    private val service: LienzoService,
) {
    @GetMapping
    fun getAll() = service.findAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long) = service.findById(id)

    @PostMapping("/{id}/deltas")
    fun postDeltas(@PathVariable id: Long, @RequestBody delta: List<PointDeltaDTO>) = service.applyDelta(id, delta)
}
