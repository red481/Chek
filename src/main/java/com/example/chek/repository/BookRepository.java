package com.example.chek.repository;

import com.example.chek.domain.book.Book;
import com.example.chek.domain.book.CategoryType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Page<Book> findAllByCategory_CategoryType(CategoryType categoryType, Pageable pageable);
}