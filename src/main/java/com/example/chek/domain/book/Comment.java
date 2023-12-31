package com.example.chek.domain.book;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Comment {

    @Id @GeneratedValue
    @Column(name = "comment_id")
    private Long id;

    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @Column(name = "reply_level")
    private int replyLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    private Review review;

    @Nullable
    @Column(name = "parent_comment_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Comment parentComment;

    @OneToMany(mappedBy = "parentComment", cascade = CascadeType.ALL)
    private List<Comment> childComment = new ArrayList<>();

    @Column(name = "soft_delete")
    private boolean softDelete;

    private LocalDateTime createdDate;

    private LocalDateTime modifiedDate;
}
