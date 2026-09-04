package com.github.aunkerrr.repositoryspringboottry.dto;

import org.hibernate.dialect.function.SybaseTruncFunction;

public record BookSearchParametersDto(
        String[] titles,
        String[] authors
) {
}
