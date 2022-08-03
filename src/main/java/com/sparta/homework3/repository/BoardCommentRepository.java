package com.sparta.homework3.repository;

import com.sparta.homework3.domain.BoardComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardCommentRepository extends JpaRepository<BoardComment, Long> {
    List<BoardComment> findAllByOrderByCreatedAtDesc();
}
