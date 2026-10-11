package br.com.estudos.estudosspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public GeradorId geradorId() {
        return new GeradorId();
    }
}

class GeradorId { }
