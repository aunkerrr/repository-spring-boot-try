package com.github.aunkerrr.repositoryspringboottry.repository;

import com.github.aunkerrr.repositoryspringboottry.model.Book;
import java.util.List;

public interface BookRepository {
    Book save(Book entity);

    List<Book> findAll();
}
