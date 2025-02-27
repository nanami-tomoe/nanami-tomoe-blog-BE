package com.tomoe.blog.nanamitomoeblogbe.dto.common;

import com.tomoe.blog.nanamitomoeblogbe.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class ExceptionDto {
    private final Integer code;
    private final String message;
    private final String detailMessage;  // 세부 메시지 추가

    // 기본 생성자
    private ExceptionDto(Integer code, String message, String detailMessage) {
        this.code = code;
        this.message = message;
        this.detailMessage = detailMessage;
    }

    // ErrorCode를 기반으로 생성하는 생성자
    public static ExceptionDto of(ErrorCode errorCode) {
        return new ExceptionDto(errorCode.getCode(), errorCode.getMessage(), null);
    }

    // 세부 메시지를 받을 수 있는 생성자
    public static ExceptionDto of(Integer code, String message, String detailMessage) {
        return new ExceptionDto(code, message, detailMessage);
    }
}