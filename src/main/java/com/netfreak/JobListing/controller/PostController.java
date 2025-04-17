package com.netfreak.JobListing.controller;


import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
public class PostController {

    @ApiIgnore
    @RequestMapping("/")
    public void redirect(HttpServletResponse response) throws Exception{
        response.sendRedirect("/swagger-ui.html");
    }



}
