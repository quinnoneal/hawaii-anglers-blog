package com.hifishing.blog.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
@Data
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", nullable = false, length=100)
    private String title;

    @Column(name = "description", length=500)
    private String description;

    @Column(name = "body", nullable = false)
    private String body;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "date_posted")
    private LocalDateTime datePosted;
}
