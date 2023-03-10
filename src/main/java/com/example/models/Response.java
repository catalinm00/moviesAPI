package com.example.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Response {
  private int page;
  private Movie[] results;
  private int total_pages;
  private int total_results;
}
