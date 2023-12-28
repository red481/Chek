package com.example.chek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/book")
public class BookController {

    @GetMapping("/{bookId}")
    public String viewBookPage() {
        return "book";
    }

    @PostMapping{
        public String addBook() {
            return "book";
        }
    }
    @GetMapping
    public String getCategotyPage(@RequestParam("category") String category) {
        return "category";
    }




}

}
