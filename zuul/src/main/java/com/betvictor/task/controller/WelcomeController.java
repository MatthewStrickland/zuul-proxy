package com.betvictor.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller serving a welcome message.
 */
@RestController
public class WelcomeController {

    /**
     * Gets the welcome message..
     * @return the welcome message
     */
    @GetMapping
    public String getWelcomeMessage() {
        return "Welcome!";
    }

}
