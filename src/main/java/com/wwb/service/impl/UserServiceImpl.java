package com.wwb.service.impl;

import com.wwb.dao.UserRepository;
import com.wwb.model.User;
import com.wwb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findList(final User user) {
        return userRepository.findList(user);
    }

    @Override
    public User findByUsername(final String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public int save(final  User user) {
        return userRepository.insert(user);
    }
}
