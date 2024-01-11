package com.example.chek.service;

import com.example.chek.domain.book.Book;
import com.example.chek.domain.book.CategoryType;
import com.example.chek.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Page findAllByCategoryType(CategoryType categoryType, Pageable pageable) {
        Page<Book> page = bookRepository.findAllByCategory_CategoryType(categoryType, pageable);
        log.info("page: {}", page);
        return page;
    }


}
