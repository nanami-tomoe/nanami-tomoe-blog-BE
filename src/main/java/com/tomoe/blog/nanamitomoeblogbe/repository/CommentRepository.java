package com.tomoe.blog.nanamitomoeblogbe.repository;

import com.tomoe.blog.nanamitomoeblogbe.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}