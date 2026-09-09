package com.github.aunkerrr.repositoryspringboottry.repository.bookSpec;

import com.github.aunkerrr.repositoryspringboottry.model.Book;
import com.github.aunkerrr.repositoryspringboottry.repository.spec.SpecificationProvider;
import java.util.Arrays;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class AuthorSpecificationProvider implements SpecificationProvider<Book> {
    @Override
    public String getKey() {
        return "author";
    }

    @Override
    public Specification<Book> getSpecification(String[] params) {
        return (root, query, criteriaBuilder)
                -> root.get("author").in(Arrays.asList(params));
    }
}
