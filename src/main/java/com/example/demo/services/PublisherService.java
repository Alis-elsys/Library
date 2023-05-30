package com.example.demo.services;

import com.example.demo.entities.Publisher;
import java.util.List;

public interface PublisherService {
    List<Publisher> AllPublishers();
    Publisher findById(Long id);
    Publisher save(Publisher publisher);
    Publisher update(Publisher publisher);
    void deleteById(Long id);
}
