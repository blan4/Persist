package org.seniorsigan.downloader

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class BeansConfig {
    @Bean
    open fun service(): Service {
        return Service()
    }
}
