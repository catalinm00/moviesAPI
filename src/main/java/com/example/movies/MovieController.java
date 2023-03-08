package com.example.movies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {
    
    @GetMapping(value = "/movie/{name}")
    public Movie[] getMovie(@RequestParam("name") String name){
        return null;
    }

}
