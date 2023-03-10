package com.example.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class Language {
    private String name;
    private String iso_639_1;
    private String english_name;
}
