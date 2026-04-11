package org.pin.backend.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig : WebMvcConfigurer {
    // Esto hace que http://tu-servidor:8080/uploads/archivo.jpg funcione
    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry
            .addResourceHandler("/multimedia/**")
            .addResourceLocations("file:multimedia/")
    }
}
