package com.example.chek.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

        @RequestMapping("home/index")
        public String index() {
            return "index";
        }
}
