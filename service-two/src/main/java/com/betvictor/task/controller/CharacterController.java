package com.betvictor.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Controller serving a list of characters.
 */
@RestController
public class CharacterController {

    /**
     * Gets a list of movie characters.
     * @return a list of movie characters
     */
    @GetMapping
    public List<String> getCharacters() {
        return Arrays.asList("frodo", "sam", "merry", "pippin");
    }

}
