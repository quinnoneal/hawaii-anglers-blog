package com.hifishing.blog.service;

import com.hifishing.blog.model.Post;

import java.util.List;

public interface PostService {
    void save(Post post);
    Post findById(Long id);
    List<Post> findAll();
    void deleteById(Long id);
}
