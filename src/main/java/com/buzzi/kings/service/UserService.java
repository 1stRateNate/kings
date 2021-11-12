package com.buzzi.kings.service;

import com.buzzi.kings.model.User;

public interface UserService {
    User getUser(int id);

    User createUser(User user);

    void deleteUser(int id);
}
