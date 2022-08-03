package com.sparta.homework3.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class BoardComment extends TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @ManyToOne(optional = false)
    private Board board;

    @Setter
    @Column(nullable = false, length = 500)
    private String comment;

    public BoardComment(Board board, String comment){
        this.board = board;
        this.comment = comment;
    }
}
