package com.example.demo.services.implementation;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.services.UserService;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<User> AllUsers() {
        return userRepository.findAll(); }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        User userTemp = userRepository.findById(user.getId()).orElse(null);
        if(userTemp != null) {
            userTemp.setName(user.getName());
            userTemp.setName(user.getName());
            userTemp.setAddress(user.getAddress());
            userTemp.setPhone(user.getPhone());
            userTemp.setEmail(user.getEmail());
            userTemp.setFines(user.getFines());
            userTemp.setBorrowedBooks(user.getBorrowedBooks());
            return userRepository.save(userTemp);
        }
        userRepository.save(user);
        return user;
    }

    @Override
    public void deleteById(Long id) { userRepository.deleteById(id); }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null); }
}
