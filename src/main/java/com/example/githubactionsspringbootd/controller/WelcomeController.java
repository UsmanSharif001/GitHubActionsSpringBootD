package com.example.githubactionsspringbootd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    //Comment
    @GetMapping("")
    public String index(){

        return "welcome";
    }
}
