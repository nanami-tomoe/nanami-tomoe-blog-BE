package com.tomoe.blog.nanamitomoeblogbe.controller;

import com.tomoe.blog.nanamitomoeblogbe.dto.common.ResponseDto;
import com.tomoe.blog.nanamitomoeblogbe.dto.request.MailRequestDto;
import com.tomoe.blog.nanamitomoeblogbe.dto.response.MailResponseDto;
import com.tomoe.blog.nanamitomoeblogbe.service.SendMailService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/mail")
public class MailController {

    private final SendMailService sendMailService;

    // 메일 전송
    @PostMapping("/send")
    public ResponseDto<MailResponseDto> sendMail(@Valid @RequestBody MailRequestDto requestDto) {
        sendMailService.sendMail(requestDto);  // 메일 전송 서비스 호출

        // 응답 데이터 생성
        MailResponseDto responseDto = new MailResponseDto(
                "메일 전송이 완료되었습니다.",
                requestDto.email(),
                requestDto.name()
        );

        return ResponseDto.ok(responseDto);  // 상태와 관련된 정보를 data로 반환
    }
}
