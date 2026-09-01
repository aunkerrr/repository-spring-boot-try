package com.github.aunkerrr.repositoryspringboottry.repository;

import com.github.aunkerrr.repositoryspringboottry.model.Book;
import java.util.List;
import java.util.Optional;

public interface BookRepository {
    Book save(Book entity);

    List<Book> findAll();

    Optional<Book> findById(Long id);
}
