package com.myelibrary.library.services.implementation;

import com.myelibrary.library.model.User;
import com.myelibrary.library.repository.UserRepository;
import com.myelibrary.library.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAllById(Iterable<Long> userId) {
        return userRepository.findAllById(userId);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteInBatch(Iterable<Long> userId) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public User getOneUser(Long userId) {
        return userRepository.getOne(userId);
    }
}
