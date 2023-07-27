package com.example.live_agenda_front.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    private String getPage(){
        return "index.html";
    }

}
