package com.riki.connect_db.service.impl;

import com.riki.connect_db.model.User;
import com.riki.connect_db.repository.UserRepository;
import com.riki.connect_db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
