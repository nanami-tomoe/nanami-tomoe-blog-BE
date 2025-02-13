package com.tomoe.blog.nanamitomoeblogbe.repository;

import com.tomoe.blog.nanamitomoeblogbe.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}