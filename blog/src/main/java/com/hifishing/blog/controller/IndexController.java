package com.hifishing.blog.controller;

import com.hifishing.blog.model.Post;
import com.hifishing.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    private final PostService postService;

    @Autowired
    public IndexController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String returnIndex(Model model) {
        List<Post> posts = postService.findAll();
        model.addAttribute("posts", posts);
        return "index";
    }
}
