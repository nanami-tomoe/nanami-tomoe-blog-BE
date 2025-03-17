package com.tomoe.blog.nanamitomoeblogbe.service;

import com.tomoe.blog.nanamitomoeblogbe.dto.request.MailRequestDto;
import com.tomoe.blog.nanamitomoeblogbe.exception.CustomException;
import com.tomoe.blog.nanamitomoeblogbe.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SendMailService {

    private final JavaMailSender emailSender;

    public void sendMail(MailRequestDto data) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(data.email());
            message.setTo("npnp123npnp123@gamil.com"); // 관리자 이메일
            message.setSubject("문의 사항: " + data.name());
            message.setText(data.message() + "\n\n보낸 사람: " + data.email());

            emailSender.send(message);
            log.info("메일 전송 성공: {}", data);

        } catch (MailException e) {
            log.error("메일 전송 실패", e);
            throw new CustomException(ErrorCode.MAIL_SEND_ERROR);
        }
    }
}
