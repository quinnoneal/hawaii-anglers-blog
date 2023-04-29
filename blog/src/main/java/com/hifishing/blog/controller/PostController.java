package com.hifishing.blog.controller;

import com.hifishing.blog.model.Post;
import com.hifishing.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public String returnPostsPage() {
        return "posts";
    }

    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable Long postId, Model model) {
        Post post = postService.findById(postId);
        model.addAttribute("post", post);
        return "post";
    }
}
