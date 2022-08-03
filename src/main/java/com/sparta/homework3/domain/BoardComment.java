package com.sparta.homework3.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class BoardComment extends TimeStamped {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private Long commentId;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String reply;

    @Column(nullable = false)
    private Long userId;
}
