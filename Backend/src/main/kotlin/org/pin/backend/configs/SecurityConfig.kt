package org.pin.backend.configs

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfig {
    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .csrf { it.disable() }
            .authorizeHttpRequests { auth ->
                auth
                    .requestMatchers("/api/auth/**")
                    .permitAll()
                    .requestMatchers(HttpMethod.POST, "/api/casas/{casaId}/join")
                    .permitAll()
                auth.anyRequest().permitAll()
            }

        return http.build()
    }
}
