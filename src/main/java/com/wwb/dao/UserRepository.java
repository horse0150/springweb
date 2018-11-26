package com.wwb.dao;

import com.wwb.model.User;

import java.util.List;

public interface UserRepository {

    public List<User> findList(User user);

    public User findByUsername(String username);

    public int insert(User user);
}
