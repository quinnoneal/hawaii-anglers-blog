package com.hifishing.blog.service;

import com.hifishing.blog.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    void save(Post post);
    Optional<Post> findById(Long id);
    List<Post> findAll();
    void deleteById(Long id);
}
