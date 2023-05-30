package com.example.demo.services;

import com.example.demo.entities.Fine;
import com.example.demo.entities.User;
import java.util.List;

public interface FineService {
    List<Fine> findAll();

    Fine findById(Long id);
    Fine save(Fine fine);
    Fine update(Fine fine);
    void deleteById(Long id);

}
