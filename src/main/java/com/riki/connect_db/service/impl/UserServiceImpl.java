package com.riki.connect_db.service.impl;

import com.riki.connect_db.model.User;
import com.riki.connect_db.repository.UserRepository;
import com.riki.connect_db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<User> updateUser(Long id, User userDetails) {
        return userRepository.findById(id).map(user -> {
           user.setName(userDetails.getName());
           user.setEmail(userDetails.getEmail());
           user.setAddress(userDetails.getAddress());
           return userRepository.save(user);
        });
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }


}
