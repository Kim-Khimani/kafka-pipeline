package com.trading.wikimedia.producer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

//this class helps to consume the reactive wikimedia API
@Configuration
public class WebClientConfig {
    @Bean
    public WebClient.Builder webClientBuilder(){
        return WebClient.builder();
    }
}
