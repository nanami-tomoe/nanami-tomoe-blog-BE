package com.tomoe.blog.nanamitomoeblogbe.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    // 500 Internal Server Error (서버 내부 오류)
    INTERNAL_SERVER_ERROR(5000, HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부 오류가 발생하였습니다."),
    MAIL_SEND_ERROR(5001, HttpStatus.INTERNAL_SERVER_ERROR, "메일 전송에 실패하였습니다."),
    MAIL_SMTP_CONNECTION_FAILED(5002, HttpStatus.INTERNAL_SERVER_ERROR, "메일 서버 연결에 실패하였습니다."),

    // 503 Service Unavailable (일시적 서비스 불가)
    SERVICE_UNAVAILABLE(5030, HttpStatus.SERVICE_UNAVAILABLE, "현재 서비스를 이용할 수 없습니다. 잠시 후 다시 시도해주세요.");

    private final Integer code;
    private final HttpStatus httpStatus;
    private final String message;
}
