package com.example.chek.domain.book;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", nullable = false)
    private Long id;

    @Column(name = "book_title", nullable = false)
    private String title;

    @Column(name = "book_author")
    private String author;

    @Column(name = "book_isbn")
    private String isbn;

    @Column(name = "book_summary")
    private String summary;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    @Column(name = "review_count")
    private int numberOfReviews;

    @JsonIgnore
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();

    public Book() {
    }
}
