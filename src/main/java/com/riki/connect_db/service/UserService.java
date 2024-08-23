package com.riki.connect_db.service;

import com.riki.connect_db.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> getAllUsers();

    public User createUser(User user);

    public Optional<User> getUserById(Long id);

    public Optional<User> updateUser(Long id, User userDetails);

    public void deleteUser(Long id);
}
