package com.example.chek.domain.book;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Comment {

    @Id @GeneratedValue
    @Column(name = "comment_id")
    private Long id;

    private String content;

    private Member member;

    private Review review;

    private Comment childComment;

    @Column(name = "soft_delete")
    private boolean softDelete;

    private LocalDateTime createdDate;

    private LocalDateTime modifiedDate;
}
