package org.pin.backend.dto.Data

open class PostItDTO(
    val id: Long,
    val lienzoId: Long?,
    val posicionX: Float,
    val posicionY: Float,
    val width: Int,
    val height: Int,
    val localizacion: String,
    val tipo: String = "DIBUJO",
    val rutaAudio: String? = null,
    // Hex-string background color of the note ("#FFF9C4"). Nullable — omitted for
    // legacy post-its (client defaults to yellow) and for AUDIO/IMAGEN types.
    val colorNota: String? = null,
)
