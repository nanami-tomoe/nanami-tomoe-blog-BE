package com.tomoe.blog.nanamitomoeblogbe.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    // Mail Error
    MAIL_SEND_ERROR(4001, HttpStatus.INTERNAL_SERVER_ERROR, "메일 전송에 실패하였습니다."),
    MAIL_NOT_FOUND(4002, HttpStatus.NOT_FOUND, "메일을 찾을 수 없습니다."),
    MAIL_ALREADY_READ(4003, HttpStatus.BAD_REQUEST, "이미 읽은 메일입니다.");

    private final Integer code;
    private final HttpStatus httpStatus;
    private final String message;
}
