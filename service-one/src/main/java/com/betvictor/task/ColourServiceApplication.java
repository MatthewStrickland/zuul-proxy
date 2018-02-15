package com.betvictor.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Main class for the colours microservice.
 */
@SpringBootApplication
@EnableEurekaClient
public class ColourServiceApplication {

    /**
     * Application entry point.
     * @param args the arguments, none needed
     */
    public static void main(final String[] args) {
        SpringApplication.run(ColourServiceApplication.class);
    }
}
