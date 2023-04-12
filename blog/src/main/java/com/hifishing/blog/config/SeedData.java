package com.hifishing.blog.config;

import com.hifishing.blog.model.Post;
import com.hifishing.blog.model.User;
import com.hifishing.blog.service.PostService;
import com.hifishing.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SeedData implements CommandLineRunner {

    private final UserService userService;
    private final PostService postService;

    @Autowired
    public SeedData(UserService userService, PostService postService) {
        this.userService = userService;
        this.postService = postService;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setFirstName("Quinn");
        user.setLastName("O'Neal");
        user.setEmail("qdawg@gmail.com");
        user.setUsername("qdawg808");
        user.setPassword("password");

        userService.save(user);

        Post post = new Post();
        post.setUser(user);
        post.setTitle("My First Blog Post");
        post.setBody("Hello world! This is my first fishing blog post! Shaka braddahz!");
        post.setDatePosted(LocalDateTime.now());

        postService.save(post);
    }
}
