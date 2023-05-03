package com.hifishing.blog.service;

import com.hifishing.blog.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void save(User user);
    User findById(Long id);
    List<User> findAll();
    void deleteById(Long id);
    Optional<User> findByEmail(String s);
}
