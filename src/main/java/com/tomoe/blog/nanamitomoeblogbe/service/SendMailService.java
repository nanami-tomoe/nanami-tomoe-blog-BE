package com.tomoe.blog.nanamitomoeblogbe.service;

import com.tomoe.blog.nanamitomoeblogbe.repository.MailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SendMailService {

    private final MailRepository mailRepository;

    public void sendMail(String name, String address, String text) {
        // 사용자가 이름, 메일주소, 내용을 입력하면 관리자 이메일로 해당 내용 발송.
        // 성공 여부 알림 표시.

        String adminEmail = "npnp123npnp123@gmail.com";


    }
}
