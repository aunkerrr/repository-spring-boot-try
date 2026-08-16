package com.github.aunkerrr.repositoryspringboottry.service.impl;

import com.github.aunkerrr.repositoryspringboottry.model.Book;
import com.github.aunkerrr.repositoryspringboottry.repository.impl.BookRepositoryImpl;
import com.github.aunkerrr.repositoryspringboottry.service.BookService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepositoryImpl bookRepository;

    @Override
    public Book save(Book entity) {
        return bookRepository.save(entity);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
