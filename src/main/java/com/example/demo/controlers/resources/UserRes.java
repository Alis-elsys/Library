package com.example.demo.controlers.resources;

import com.example.demo.entities.Book;
import com.example.demo.entities.Fine;
import jakarta.annotation.Resource;
import java.util.List;

@Resource
public class UserRes {
    private Long id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private List<Book> borrowedBooks;
    private List<Fine> fines;
}
