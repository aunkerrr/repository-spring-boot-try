package com.github.aunkerrr.repositoryspringboottry.repository.book.specification;

import com.github.aunkerrr.repositoryspringboottry.dto.BookSearchParametersDto;
import com.github.aunkerrr.repositoryspringboottry.model.Book;
import com.github.aunkerrr.repositoryspringboottry.repository.specification.SpecificationBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookSpecificationBuilder implements SpecificationBuilder<Book> {
    private final BookSpecificationProviderManager bookSpecificationProviderManager;

    @Override
    public Specification<Book> build(BookSearchParametersDto searchParametersDto) {
        Specification<Book> specification = Specification.where(((root, query, criteriaBuilder)
                -> criteriaBuilder.conjunction()));

        if (searchParametersDto.authors() != null && searchParametersDto.authors().length > 0) {
            specification = specification.and(bookSpecificationProviderManager
                    .getSpecificationProviderManager("author")
                    .getSpecification(searchParametersDto.authors()));
        }

        if (searchParametersDto.titles() != null && searchParametersDto.titles().length > 0) {
            specification = specification.and(bookSpecificationProviderManager
                    .getSpecificationProviderManager("title")
                    .getSpecification(searchParametersDto.titles()));
        }

        return specification;
    }
}
