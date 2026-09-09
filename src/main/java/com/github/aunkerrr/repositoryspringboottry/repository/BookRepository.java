package com.github.aunkerrr.repositoryspringboottry.repository;

import com.github.aunkerrr.repositoryspringboottry.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookRepository extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book> {
}
