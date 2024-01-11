package com.example.chek.domain.book;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "category_type", nullable = false)
    private CategoryType categoryType;

    @Column(name = "category_name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Book> books = new ArrayList<>();

    public Category() {
    }

    public Category(String name, CategoryType categoryType) {
        this.name = name;
        this.categoryType = categoryType;
    }

}
