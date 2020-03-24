package com.example.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    private String greeting;
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @GetMapping
    public ModelAndView home(HttpServletRequest request,
                             HttpServletResponse response) throws Exception{

        System.out.println("receive home request");
        return new ModelAndView("home", "message", greeting);
    }
}
