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
        post.setTitle("My First Blog Post!");
        post.setDescription("This is my very first post on my new blog. This blog is for posts that have to do with Hawaii fishing in any way shape or form. Please join me on this adventure and create an account to post or comment on others' posts! Thanks for stopping by.");
        post.setBody("Hello world! This is my first fishing blog post! Shaka braddahz!");
        post.setDatePosted(LocalDateTime.now());

        Post post2 = new Post();
        post2.setUser(user);
        post2.setTitle("What is Lorem Ipsum?");
        post2.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
        post2.setBody("Hello world! This is my first fishing blog post! Shaka braddahz!");
        post2.setDatePosted(LocalDateTime.now());

        Post post3 = new Post();
        post3.setUser(user);
        post3.setTitle("What is Lorem Ipsum?");
        post3.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
        post3.setBody("Hello world! This is my first fishing blog post! Shaka braddahz!");
        post3.setDatePosted(LocalDateTime.now());

        Post post4 = new Post();
        post4.setUser(user);
        post4.setTitle("What is Lorem Ipsum?");
        post4.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
        post4.setBody("Hello world! This is my first fishing blog post! Shaka braddahz!");
        post4.setDatePosted(LocalDateTime.now());

        postService.save(post);
        postService.save(post2);
        postService.save(post3);
        postService.save(post4);

    }
}
