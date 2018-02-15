package com.betvictor.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for the characters microservice.
 */
@SpringBootApplication
public class CharacterServiceApplication {

    /**
     * Application entry point.
     * @param args the arguments, none needed
     */
    public static void main(final String[] args) {
        SpringApplication.run(CharacterServiceApplication.class);
    }
}
