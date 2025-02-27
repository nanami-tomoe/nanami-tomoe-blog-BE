package com.tomoe.blog.nanamitomoeblogbe.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
* 예외가 발생하면 ErrorCode 를 기반으로 통합적으로 관리 가능
*/
@Getter
public class CustomException extends RuntimeException {
    private final ErrorCode errorCode;

    public CustomException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
