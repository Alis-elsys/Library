package com.example.demo.services.implementation;

import com.example.demo.entities.Publisher;
import com.example.demo.repository.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.services.PublisherService;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PublisherServiceImp implements PublisherService {
    private final PublisherRepository publisherRepository;
    @Override
    public List<Publisher> AllPublishers() {
        return publisherRepository.findAll();
    }

    @Override
    public Publisher findById(Long id) {
        return publisherRepository.findById(id).orElse(null);
    }

    @Override
    public Publisher save(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    @Override
    public Publisher update(Publisher publisher) {
        Publisher publisherTemp = publisherRepository.findById(publisher.getId()).orElse(null);
        if (publisherTemp != null) {
            publisherTemp.setName(publisher.getName());
            publisherTemp.setAddress(publisher.getAddress());
            publisherTemp.setPhone(publisher.getPhone());
            publisherTemp.setEmail(publisher.getEmail());
            return publisherRepository.save(publisherTemp);
        }
        publisherRepository.save(publisher);
        return publisher;
    }

    @Override
    public void deleteById(Long id) {
        publisherRepository.deleteById(id);
    }
}
