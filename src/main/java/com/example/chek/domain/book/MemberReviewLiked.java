package com.example.chek.domain.book;

import jakarta.persistence.*;

@Entity
public class MemberReviewLiked {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_review_liked_id")
    private Long id;

    private boolean liked;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    private Review review;
}
