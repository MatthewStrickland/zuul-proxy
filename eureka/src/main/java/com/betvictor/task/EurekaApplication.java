package com.betvictor.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Main class for the eureka microservice.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    /**
     * Application entry point.
     * @param args the arguments, none needed
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class);
    }
}
