package com.igortbr.vote;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.cdimascio.dotenv.Dotenv;

@Configuration
public class DontenvConfig {

	@Bean
    public Dotenv dotenv() {
        return Dotenv.load();
    }}
