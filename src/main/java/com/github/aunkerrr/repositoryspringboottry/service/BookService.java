package com.github.aunkerrr.repositoryspringboottry.service;

import com.github.aunkerrr.repositoryspringboottry.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book entity);

    List<Book> findAll();
}
