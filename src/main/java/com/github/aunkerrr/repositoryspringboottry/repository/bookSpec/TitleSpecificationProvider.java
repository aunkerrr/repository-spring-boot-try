package com.github.aunkerrr.repositoryspringboottry.repository.bookSpec;

import com.github.aunkerrr.repositoryspringboottry.model.Book;
import com.github.aunkerrr.repositoryspringboottry.repository.spec.SpecificationProvider;
import java.util.Arrays;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class TitleSpecificationProvider implements SpecificationProvider<Book> {
    @Override
    public String getKey() {
        return "title";
    }

    @Override
    public Specification<Book> getSpecification(String[] params) {
        return ((root, query, criteriaBuilder)
                -> root.get("title").in(Arrays.asList(params)));
    }
}
