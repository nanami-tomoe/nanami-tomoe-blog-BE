package com.tomoe.blog.nanamitomoeblogbe.dto.response;

public record MailResponseDto(
        String status,        // 메일 전송 상태
        String recipientEmail, // 받는 사람 이메일
        String senderName     // 보내는 사람 이름
) {}
