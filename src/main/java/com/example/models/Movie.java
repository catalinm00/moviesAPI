package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Movie {
    private int id;
    private String title;
    private String poster_path;
    private String overview;
    private double vote_average;
    private int vote_count;
    private int[] genre_ids;
    private String release_date;
 
}
