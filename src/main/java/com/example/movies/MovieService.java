package com.example.movies;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.response.Response;

@Service
public class MovieService {
    private final String apiKey = "ca4ba7f40425f8071ed786ec5be39ac7";
    private final String baseUrl = "https://api.themoviedb.org/3/";
    WebClient.Builder builder = WebClient.builder();

    public Movie[] getMovieByTitle(String title) {
        try {
            Response resp = builder
              .baseUrl(baseUrl)
              .build()
              .get()
              .uri("search/movie?api_key=" + apiKey + "&language=en-US" + "&query=" + title )
              .retrieve()
              .bodyToMono(Response.class)
              .block();
              
        return resp.getResults();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }
}
