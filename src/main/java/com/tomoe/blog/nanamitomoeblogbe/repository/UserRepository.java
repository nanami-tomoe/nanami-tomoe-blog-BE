package com.tomoe.blog.nanamitomoeblogbe.repository;

import com.tomoe.blog.nanamitomoeblogbe.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}