package com.example.demo.services;

import com.example.demo.entities.User;
import java.util.List;

public interface UserService {
    List<User> AllUsers();
    User findById(Long id);
    User save(User user);
    User update(User user);
    void deleteById(Long id);
}
