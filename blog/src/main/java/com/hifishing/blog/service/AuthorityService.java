package com.hifishing.blog.service;

import com.hifishing.blog.model.Authority;
import com.hifishing.blog.model.Post;

import java.util.List;
import java.util.Optional;

public interface AuthorityService {
    void save(Authority authority);
    Optional<Authority> findByName(String name);
    List<Authority> findAll();
    void deleteByName(String name);

}
