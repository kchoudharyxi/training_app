package com.training.app.service;

import com.training.app.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
