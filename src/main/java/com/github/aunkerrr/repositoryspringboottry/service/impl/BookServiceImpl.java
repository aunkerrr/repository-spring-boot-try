package com.github.aunkerrr.repositoryspringboottry.service.impl;

import com.github.aunkerrr.repositoryspringboottry.model.Book;
import com.github.aunkerrr.repositoryspringboottry.repository.impl.BookRepositoryImpl;
import com.github.aunkerrr.repositoryspringboottry.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepositoryImpl bookRepository;

    @Override
    public Book save(Book entity) {
        return bookRepository.save(entity);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
