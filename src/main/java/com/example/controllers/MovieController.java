package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Movie;
import com.example.services.MovieService;

@RestController
@RequestMapping(path = "/movies", produces = "application/json")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("")
    public Movie[] getMovie(@RequestParam(required = true) String title,
            @RequestParam(required = false, defaultValue = "1") String page) {
        return movieService.getByTitle(title, page);
    }

    @GetMapping("/popular")
    public Movie[] getPopular() {
        return movieService.getPopular();
    }

    @GetMapping("/{id}")
    public Movie getMovieDetails(@PathVariable String id) {
        return movieService.getById(id);
    }

}
