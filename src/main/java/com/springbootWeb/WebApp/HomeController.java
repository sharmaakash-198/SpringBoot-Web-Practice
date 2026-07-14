package com.springbootWeb.WebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        System.out.println("I am here.. !");
        return "Welcome to My WebApp !!";
    }

    @RequestMapping("/about")
    public String about(){
        return "Hi, I am lazy Developer...";
    }
}
