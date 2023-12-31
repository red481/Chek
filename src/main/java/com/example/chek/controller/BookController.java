package com.example.chek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/book")
public class BookController {

//    @GetMapping("/new")
//    public String viewAddBookForm() {
//        return "add-book";
//    }
//
//    @PostMapping("/new")
//    public String createBookPage() {
//        return "add-book";
//    }

//    @GetMapping("/{bookId}")
//    public String viewBookPage() {
//        return "book";
//    }

    @GetMapping("/new-review")
    public String addReviewForm() {
        return "book/reviewForm";
    }

//    @PostMapping("/{bookId}/new-review")
//    public String addReviewPage() {
//        return "redirect:/book/{bookId}";
//    }
//
//
//    @GetMapping
//    public String getCategoryPage(@RequestParam("category") String category) {
//        return "category";
//    }

}


