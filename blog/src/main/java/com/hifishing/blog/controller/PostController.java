package com.hifishing.blog.controller;

import com.hifishing.blog.model.Post;
import com.hifishing.blog.model.User;
import com.hifishing.blog.service.PostService;
import com.hifishing.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class PostController {

    private final PostService postService;
    private final UserService userService;

    @Autowired
    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/posts")
    public String returnPostsPage() {
        return "posts";
    }

    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable Long id, Model model) {
        Post post = postService.findById(id);
        model.addAttribute("post", post);
        return "post";
    }

    @GetMapping("/posts/new")
    public String createNewPost(Model model) {
        Optional<User> optionalUser = userService.findByEmail("quinnoneal@hotmail.com");
        if(optionalUser.isPresent()) {
            Post post = new Post();
            post.setUser(optionalUser.get());
            model.addAttribute("post", post);
            return "post_new";
        } else {
            return "404";
        }
    }

    @PostMapping("/posts/new")
    public String saveNewPost(@ModelAttribute Post post) {
        postService.save(post);
        return "redirect:/posts/" + post.getId();
    }
}
