package com.betvictor.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Main class for the zuul proxy microservice.
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {

    /**
     * Application entry point.
     * @param args the arguments, none needed
     */
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class);
    }
}
