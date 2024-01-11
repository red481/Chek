package com.example.chek.controller;

import com.example.chek.domain.book.CategoryType;
import com.example.chek.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import static org.junit.jupiter.api.Assertions.*;



class CategoryControllerTest {
    BookService categoryService = new BookService();



    @Test
    void findAllByCategoryType() {
        //given
        Pageable pageable = PageRequest.of(0, 10);

        //when
        Page page = categoryService.findAllByCategoryType(CategoryType.NOVEL, pageable);

       //then
        assertEquals(page, categoryService.findAllByCategoryType(CategoryType.NOVEL, pageable));
    }
}