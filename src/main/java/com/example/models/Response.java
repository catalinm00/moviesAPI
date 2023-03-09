package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class Response {
    //@JsonProperty("page")
    private int page;
   // @JsonProperty("results")
    private Movie[] results;
  //  @JsonProperty("total_pages")
    private int total_pages;
   // @JsonProperty("total_results")
    private int total_results;
}
