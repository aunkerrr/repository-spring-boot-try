package com.github.aunkerrr.repositoryspringboottry.service.impl;

import com.github.aunkerrr.repositoryspringboottry.dto.BookDto;
import com.github.aunkerrr.repositoryspringboottry.dto.CreateBookRequestDto;
import com.github.aunkerrr.repositoryspringboottry.exception.EntityNotFoundException;
import com.github.aunkerrr.repositoryspringboottry.mapper.BookMapper;
import com.github.aunkerrr.repositoryspringboottry.model.Book;
import com.github.aunkerrr.repositoryspringboottry.repository.BookRepository;
import com.github.aunkerrr.repositoryspringboottry.service.BookService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
 
    private final BookMapper bookMapper;
    private final BookRepository bookRepository;


    @Override
    public BookDto save(CreateBookRequestDto requestDto) {
        Book bookToSave = bookMapper.toModel(requestDto);
        Book savedBook = bookRepository.save(bookToSave);
        return bookMapper.toDto(savedBook);
    }

    @Override
    public List<BookDto> findAll() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::toDto)
                .toList();
    }

    @Override
    public BookDto getBookById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(()
                        -> new EntityNotFoundException("Can't find book by id: "
                        + id));

        return bookMapper.toDto(book);
    }
}
