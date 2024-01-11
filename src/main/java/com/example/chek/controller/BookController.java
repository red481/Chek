package com.example.chek.controller;

import com.example.chek.domain.book.Book;
import com.example.chek.domain.book.CategoryType;
import com.example.chek.dto.BookDto;
import com.example.chek.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/register")
    public String viewAddBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "book/addBook";
    }

    @PostMapping("/register")
    public String createBookPage(@ModelAttribute BookDto bookDto) {
        redirect:/;
    }


    @GetMapping("/category")
    public String listAllBooksByCategoryType(@RequestParam("type") CategoryType categoryType,
                                        @RequestParam("page") int pageNumber,
                                        @RequestParam("size") int pageSize, Model model){
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        Page<Book> page = bookService.findAllByCategoryType(categoryType, pageable);
        System.out.println(page);

        model.addAttribute("page", page);
        return "/book/category";
    }

    @GetMapping("/{bookId}")
    public String viewBookPage() {
        return "book";
    }

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


