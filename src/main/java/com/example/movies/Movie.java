package com.example.movies;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Movie {
    private int id;
    private String title;
    private String poster_path;
    private String overview;
    private double vote_average;
    private String release_date;
    //private Language[] spoken_languages;
}
