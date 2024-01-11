package com.example.chek.domain.book;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Column(name = "member_name", nullable = false)
    private String name;

    @Column(name = "member_age", nullable = false)
    private int age;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id", nullable = false)
    private long id;

    @Column(name = "member_password", nullable = false)
    private String password;

    @Column(name = "member_email", nullable = false)
    private String email;

    @OneToMany(mappedBy = "member")
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Review> reviews = new ArrayList<>();
}
