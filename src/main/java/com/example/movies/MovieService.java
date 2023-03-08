package com.example.movies;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class MovieService {
    private final String apiKey = "";
    private final String baseUrl = "";
    WebClient.Builder builder = WebClient.builder();
}
