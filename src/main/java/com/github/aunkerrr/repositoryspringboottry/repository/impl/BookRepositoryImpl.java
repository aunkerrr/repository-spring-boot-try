package com.github.aunkerrr.repositoryspringboottry.repository.impl;

import com.github.aunkerrr.repositoryspringboottry.model.Book;
import com.github.aunkerrr.repositoryspringboottry.repository.BookRepository;
import jakarta.persistence.EntityManager;
import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl implements BookRepository {

    private final EntityManager entityManager;

    public BookRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public Book save(Book entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Override
    @Transactional
    public List<Book> findAll() {
        return entityManager
                .createQuery("select b from Book b", Book.class)
                .getResultList();
    }

    @Override
    public Optional<Book> findById(Long id) {
            return Optional.ofNullable(entityManager
                    .find(Book.class, id));
    }
}
