package org.pin.backend.configs

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import java.nio.file.Paths // <-- No olvides este import

@Configuration
class WebConfig : WebMvcConfigurer {
    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        val rutaAbsoluta = Paths.get("multimedia").toFile().absolutePath

        registry
            .addResourceHandler("/multimedia/**")
            .addResourceLocations("file:$rutaAbsoluta/")
            .setCachePeriod(31536000)
    }
}
