package com.example.response;

import com.example.movies.Movie;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Response {
    private int page;
    private Movie[] results;
    private int totalPages;
    private int totalResults;
}
