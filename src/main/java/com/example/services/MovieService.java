package com.example.services;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.models.Movie;
import com.example.models.Response;

@Service
public class MovieService {
    private final String apiKey = "ca4ba7f40425f8071ed786ec5be39ac7";
    private final String baseUrl = "https://api.themoviedb.org/3/";
    WebClient.Builder builder = WebClient.builder();

    public Movie[] getByTitle(String title) {

        try {
            Response resp = builder
                    .baseUrl(baseUrl)
                    .build()
                    .get()
                    .uri("search/movie?api_key=" + apiKey + "&language=en-US" + "&query=" + title)
                    .retrieve()
                    .bodyToMono(Response.class)
                    .block();

            return resp.getResults();
        } catch (Exception e) {
            System.out.println(e.getCause().toString());
        }
        return null;
    }

    public Movie getById(int id) {
        try {
            Movie resp = builder
                    .baseUrl(baseUrl)
                    .build()
                    .get()
                    .uri("movie/" + id + "?api_key=" + apiKey + "&language=en-US")
                    .retrieve()
                    .bodyToMono(Movie.class)
                    .block();

            return resp;
        } catch (Exception e) {
            System.out.println(e.getCause().toString());
        }
        return null;
    }

    public Movie[] getPopular() {
        try {
            Response resp = builder
                    .baseUrl(baseUrl)
                    .build()
                    .get()
                    .uri("movie/popular?api_key=" + apiKey + "&language=en-US")
                    .retrieve()
                    .bodyToMono(Response.class)
                    .block();

            return resp.getResults();
        } catch (Exception e) {
            System.out.println(e.getCause().toString());
        }
        return null;
    }
}
