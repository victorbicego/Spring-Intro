package com.devdojo.springtutorial.requests;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class AnimePostRequestBody {
    @NotNull(message = "The anime name cannot be null")
    @NotEmpty(message = "The anime name cannot be empty")
    private String name;
}
