package com.hifishing.blog.repository;

import com.hifishing.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Long, Post> {
}
