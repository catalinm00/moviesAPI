package com.example.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/movies/{title}")
    public Movie[] getMovie(@PathVariable String title){
        return movieService.getMovieByTitle(title);
    }

}
