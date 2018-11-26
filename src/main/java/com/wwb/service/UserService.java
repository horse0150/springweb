package com.wwb.service;

import com.wwb.model.User;

import java.util.List;

public interface UserService {
    public List<User> findList(final User user);

    public User findByUsername(final String username);

    public int save(final User user);
}
