package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.example.demo.entities.Book;
import com.example.demo.controlers.resources.BookRes;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mapping(source = "author", target = "author")
    @Mapping(source = "publisher", target = "publisher")
    @Mapping(source = "borrower", target = "borrower")
    Book bookToResuorce(BookRes resource);

    @Mapping(source = "author", target = "author")
    @Mapping(source = "publisher", target = "publisher")
    @Mapping(source = "borrower", target = "borrower")
    BookRes bookToBookRes(Book book);


    List<BookRes> toBookResList(List<Book> books);
}
