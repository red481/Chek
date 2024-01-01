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
    @Id @GeneratedValue
    @Column(name = "book_id")
    private Long id;

    private String title;

    private String author;

    private String isbn;

    private String summary;

    @JoinColumn(name = "category_id")
    private String category;

    @Column(name = "review_count")
    private int numberOfReviews;

    @JsonIgnore
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();

    @Column(name = "soft_delete")
    private boolean softDelete;
}
