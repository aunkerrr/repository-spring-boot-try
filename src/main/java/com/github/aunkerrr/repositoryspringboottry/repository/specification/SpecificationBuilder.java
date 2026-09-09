package com.github.aunkerrr.repositoryspringboottry.repository.specification;

import com.github.aunkerrr.repositoryspringboottry.dto.BookSearchParametersDto;
import org.springframework.data.jpa.domain.Specification;

public interface SpecificationBuilder<T> {
    Specification build(BookSearchParametersDto parametersDto);
}
