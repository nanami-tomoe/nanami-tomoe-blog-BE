package com.tomoe.blog.nanamitomoeblogbe.repository;

import com.tomoe.blog.nanamitomoeblogbe.domain.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Integer> {
}