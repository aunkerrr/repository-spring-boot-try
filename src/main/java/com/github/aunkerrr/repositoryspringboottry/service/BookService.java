package com.github.aunkerrr.repositoryspringboottry.service;

import com.github.aunkerrr.repositoryspringboottry.dto.BookDto;
import com.github.aunkerrr.repositoryspringboottry.dto.CreateBookRequestDto;
import java.util.List;

public interface BookService {
    BookDto save(CreateBookRequestDto entity);

    List<BookDto> findAll();

    BookDto getBookById(Long id);
}
