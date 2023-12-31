package com.example.chek.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Review {
    @Id @GeneratedValue
    @Column(name = "review_id")
    private Long id;

    private String title;

    private String content;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;


    private Book book;

    @Column(name = "like_count")
    private int likeCount;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "soft_delete")
    private boolean softDelete;

    private

    private LocalDate createdDate;
    private LocalDate modifiedDate;
}
