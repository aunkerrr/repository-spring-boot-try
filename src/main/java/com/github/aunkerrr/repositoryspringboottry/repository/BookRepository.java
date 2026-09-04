package com.github.aunkerrr.repositoryspringboottry.repository;

import com.github.aunkerrr.repositoryspringboottry.model.Book;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book save(Book entity);

    List<Book> findAll();

    Optional<Book> findById(Long id);

    void deleteById(Long id);

    List<Book> id(Long id);
}
