package com.hifishing.blog.config;

import com.hifishing.blog.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setFirstName("Quinn");
        user.setLastName("O'Neal");
        user.setEmail("qdawg@gmail.com");
        user.setUsername("qdawg808");
        user.setPassword("password");
    }
}
