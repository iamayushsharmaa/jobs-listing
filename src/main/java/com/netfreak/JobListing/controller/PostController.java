package com.netfreak.JobListing.controller;


import com.netfreak.JobListing.models.Post;
import com.netfreak.JobListing.repo.PostRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;

    @ApiIgnore
    @RequestMapping("/")
    public void redirect(HttpServletResponse response) throws Exception{
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPost(){
        return repo.findAll();
    }

}
