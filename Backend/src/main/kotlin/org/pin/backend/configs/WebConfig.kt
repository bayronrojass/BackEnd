package org.pin.backend.configs

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import java.nio.file.Paths

@Configuration
class WebConfig : WebMvcConfigurer {
    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        val rutaURI = Paths.get("multimedia").toAbsolutePath().toUri().toString()

        registry
            .addResourceHandler("/multimedia/**")
            .addResourceLocations(rutaURI)
            .setCachePeriod(31536000)
    }
}
