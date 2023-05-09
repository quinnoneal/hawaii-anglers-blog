package com.hifishing.blog.config;

import com.hifishing.blog.model.Authority;
import com.hifishing.blog.model.Post;
import com.hifishing.blog.model.User;
import com.hifishing.blog.service.AuthorityService;
import com.hifishing.blog.service.AuthorityServiceImpl;
import com.hifishing.blog.service.PostService;
import com.hifishing.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Component
public class SeedData implements CommandLineRunner {

    private final UserService userService;
    private final PostService postService;
    private final AuthorityService authorityService;

    @Autowired
    public SeedData(UserService userService, PostService postService, AuthorityService authorityService) {
        this.userService = userService;
        this.postService = postService;
        this.authorityService = authorityService;
    }

    @Override
    public void run(String... args) throws Exception {

        // USER
        User user = new User();
        user.setFirstName("Quinn");
        user.setLastName("O'Neal");
        user.setEmail("qdawg@gmail.com");
        user.setUsername("qdawg808");
        user.setPassword("password");

        // AUTHORITY
        Set<Authority> auths = new HashSet<>();
        Authority userAuth = new Authority();
        userAuth.setName("ROLE_USER");
        Authority modAuth = new Authority();
        modAuth.setName("ROLE_MODERATOR");
        Authority adminAuth = new Authority();
        adminAuth.setName("ROLE_ADMIN");
        authorityService.save(userAuth);
        authorityService.save(modAuth);
        authorityService.save(adminAuth);
        auths.add(userAuth);
        auths.add(modAuth);
        auths.add(adminAuth);
        user.setAuthorities(auths);

        userService.save(user);


        // POSTS
        Post post = new Post();
        post.setUser(user);
        post.setTitle("My First Blog Post!");
        post.setDescription("This is my very first post on my new blog. This blog is for posts that have to do with Hawaii fishing in any way shape or form. Please join me on this adventure and create an account to post or comment on others' posts! Thanks for stopping by.");
        post.setBody("Hello world! This is my first fishing blog post! Shaka braddahz!");
        post.setDatePosted(LocalDateTime.now());

        Post post2 = new Post();
        post2.setUser(user);
        post2.setTitle("Catching Limu");
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
        post4.setTitle("East vs West Side Fishing");
        post4.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
        post4.setBody("Hello world! This is my first fishing blog post! Shaka braddahz!");
        post4.setDatePosted(LocalDateTime.now());

        Post post5 = new Post();
        post5.setUser(user);
        post5.setTitle("Tilapia at Ala Wai");
        post5.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
        post5.setBody("Hello world! This is my first fishing blog post! Shaka braddahz!");
        post5.setDatePosted(LocalDateTime.now());

        Post post6 = new Post();
        post6.setUser(user);
        post6.setTitle("Hanapa'a!");
        post6.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
        post6.setBody("Hello world! This is my first fishing blog post! Shaka braddahz!");
        post6.setDatePosted(LocalDateTime.now());

        Post post7 = new Post();
        post7.setUser(user);
        post7.setTitle("How to: Rig a Dunking Pole");
        post7.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
        post7.setBody("Hello world! This is my first fishing blog post! Shaka braddahz!");
        post7.setDatePosted(LocalDateTime.now());

        Post post8 = new Post();
        post8.setUser(user);
        post8.setTitle("East vs West Side Fishing");
        post8.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
        post8.setBody("Hello world! This is my first fishing blog post! Shaka braddahz!");
        post8.setDatePosted(LocalDateTime.now());

        Post post9 = new Post();
        post9.setUser(user);
        post9.setTitle("East vs West Side Fishing");
        post9.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
        post9.setBody("Hello world! This is my first fishing blog post! Shaka braddahz!");
        post9.setDatePosted(LocalDateTime.now());

        Post post10 = new Post();
        post10.setUser(user);
        post10.setTitle("East vs West Side Fishing");
        post10.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
        post10.setBody("Hello world! This is my first fishing blog post! Shaka braddahz!");
        post10.setDatePosted(LocalDateTime.now());

        postService.save(post);
        postService.save(post2);
        postService.save(post3);
        postService.save(post4);
        postService.save(post5);
        postService.save(post6);
        postService.save(post7);
        postService.save(post8);
        postService.save(post9);
        postService.save(post10);

    }
}
