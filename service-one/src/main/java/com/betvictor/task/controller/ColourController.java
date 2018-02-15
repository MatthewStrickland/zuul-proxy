package com.betvictor.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Controller serving a list of colours.
 */
@RestController
public class ColourController {

    /**
     * Gets a list of colours.
     * @return a list of colours
     */
    @GetMapping
    public List<String> getColours() {
        return Arrays.asList("blue", "green", "red", "purple");
    }

}
