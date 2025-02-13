package com.tomoe.blog.nanamitomoeblogbe.exception;

import com.tomoe.blog.nanamitomoeblogbe.global.ErrorCode;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum MailErrorCode implements ErrorCode {
    // 이름 누락
    NAME_IS_EMPTY(HttpStatus.BAD_REQUEST, "MAIL_001", "이름을 입력해주세요."),
    // 이메일 누락
    EMAIL_IS_EMPTY(HttpStatus.BAD_REQUEST, "MAIL_002", "이메일을 입력해주세요."),
    // 내용 누락
    CONTENT_IS_EMPTY(HttpStatus.BAD_REQUEST, "MAIL_003", "내용을 입력해주세요."),
    // 이메일 형식 오류
    EMAIL_FORMAT_ERROR(HttpStatus.BAD_REQUEST, "MAIL_004", "이메일 형식이 올바르지 않습니다.");

    private final HttpStatus status;
    private final String errorCode;
    private final String message;
}
