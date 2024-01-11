package com.example.chek.domain.book;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
public class Review {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id", nullable = false)
    private Long id;

    @Column(name = "review_title", nullable = false)
    private String title;

    @Column(name = "review_content", nullable = false)
    private String content;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;


    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "like_count")
    private int likeCount;


    @Column(name = "soft_delete")
    private boolean softDelete;

    @OneToMany(mappedBy = "review", cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "review", cascade = CascadeType.ALL)
    private List<MemberReviewLiked> likes = new ArrayList<>();

    private LocalDate createdDate;
    private LocalDate modifiedDate;
}
