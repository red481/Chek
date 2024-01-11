package com.example.chek.repository;

import com.example.chek.domain.book.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
