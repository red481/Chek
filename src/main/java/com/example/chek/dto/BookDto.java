package com.example.chek.dto;

import com.example.chek.domain.book.Category;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class BookDto {
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private String summary;
    private Long categoryId;
    private MultipartFile file;
}
