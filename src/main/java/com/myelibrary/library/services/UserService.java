package com.myelibrary.library.services;

import com.myelibrary.library.model.User;
import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> findAllById(Iterable<Long> userId);

    List<User> findAll();

    void deleteInBatch(Iterable<Long> userId);

    void deleteAllInBatch();

    User getOneUser(Long userId);
}
