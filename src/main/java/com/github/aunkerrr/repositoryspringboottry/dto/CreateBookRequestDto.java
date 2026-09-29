package com.github.aunkerrr.repositoryspringboottry.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class CreateBookRequestDto {
    @NotBlank(message = "Title must not be blank")
    private String title;

    @NotBlank(message = "Author must not be blank")
    private String author;

    @NotBlank(message = "ISBN must not be blank")
    private String isbn;

    @NotNull(message = "Price must not be null")
    @Min(value = 0, message = "Price should be greater or equals to 0")
    private BigDecimal price;

    private String description;

    private String coverImage;
}
