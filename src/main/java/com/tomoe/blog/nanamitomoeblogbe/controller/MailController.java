package com.tomoe.blog.nanamitomoeblogbe.controller;

import com.tomoe.blog.nanamitomoeblogbe.service.SendMailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mail")
public class MailController {

    private final SendMailService sendMailService;

    // 메일 전송
}
