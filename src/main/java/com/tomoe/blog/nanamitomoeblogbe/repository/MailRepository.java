package com.tomoe.blog.nanamitomoeblogbe.repository;

import com.tomoe.blog.nanamitomoeblogbe.domain.Mail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailRepository extends JpaRepository<Mail, Integer> {
}