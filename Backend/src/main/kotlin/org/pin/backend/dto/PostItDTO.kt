package org.pin.backend.dto

data class PostItDTO (
    val id: Long,
    val lienzoId: Long,
    val posicionX: Float,
    val posicionY: Float,
    val plegado: Boolean?,
)