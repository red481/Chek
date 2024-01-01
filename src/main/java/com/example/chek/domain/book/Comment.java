package com.example.chek.domain.book;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Comment {

    @Id @GeneratedValue
    @Column(name = "comment_id")
    private Long id;



    @Column(length = 500)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "reply_level", columnDefinition = "integer default 0")
    private int replyLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    private Review review;

    @Nullable
    @JoinColumn(name = "parent_comment_id", referencedColumnName = "comment_id", columnDefinition = "bigint default null", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "fk_parent_comment_id"))
    @ManyToOne(fetch = FetchType.LAZY)
    private Comment parentComment;

    @OneToMany(mappedBy = "parentComment", cascade = CascadeType.ALL)
    private List<Comment> childComment = new ArrayList<>();

    @Column(name = "soft_delete")
    private boolean softDelete;

    private LocalDateTime createdDate;

    private LocalDateTime modifiedDate;
}
