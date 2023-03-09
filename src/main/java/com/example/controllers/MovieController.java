package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Movie;
import com.example.services.MovieService;

@RestController
@RequestMapping(path = "/movies", produces = "application/json")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/{title}")
    public Movie[] getMovie(@PathVariable String title) {

        return movieService.getByTitle(title);
    }

    @GetMapping("/popular")
    public Movie[] getPopular() {
        return movieService.getPopular();
    }

    @GetMapping("/{id}/details")
    public Movie getMovieDetails(@PathVariable int id) {
        return movieService.getById(id);
    }

}
