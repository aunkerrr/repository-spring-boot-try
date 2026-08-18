package com.github.aunkerrr.repositoryspringboottry.mapper;

import com.github.aunkerrr.repositoryspringboottry.dto.BookDto;
import com.github.aunkerrr.repositoryspringboottry.dto.CreateBookRequestDto;
import com.github.aunkerrr.repositoryspringboottry.model.Book;
import org.mapstruct.Mapper;
import tools.jackson.databind.cfg.MapperConfig;

@Mapper(config = MapperConfig.class, componentModel = "spring")
public interface BookMapper {
    BookDto toDto(Book entity);

    Book toModel(CreateBookRequestDto requestDto);
}
