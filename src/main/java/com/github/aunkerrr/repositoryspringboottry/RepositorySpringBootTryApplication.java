package com.github.aunkerrr.repositoryspringboottry;

import com.github.aunkerrr.repositoryspringboottry.dto.CreateBookRequestDto;
import com.github.aunkerrr.repositoryspringboottry.service.BookService;
import java.math.BigDecimal;
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
            /* CreateBookRequestDto newBook = new CreateBookRequestDto();
            newBook.setTitle("1984");
            newBook.setAuthor("George Orwell");
            newBook.setIsbn("978-0451524935");
            newBook.setPrice(BigDecimal.valueOf(9.99));
            newBook.setDescription("Dystopian novel");

            bookService.save(newBook);
            System.out.println("Book saved");

            System.out.println("All books in db: ");
            bookService.findAll();*/
        };
    }
}
