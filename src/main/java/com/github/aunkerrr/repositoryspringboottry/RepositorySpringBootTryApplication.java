package com.github.aunkerrr.repositoryspringboottry;

import com.github.aunkerrr.repositoryspringboottry.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RepositorySpringBootTryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepositorySpringBootTryApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(BookService bookService) {
        return args -> {
        };
    }
}
