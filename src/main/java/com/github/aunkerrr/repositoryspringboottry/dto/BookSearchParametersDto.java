package com.github.aunkerrr.repositoryspringboottry.dto;

public record BookSearchParametersDto(
        String[] titles,
        String[] authors
) {
}
