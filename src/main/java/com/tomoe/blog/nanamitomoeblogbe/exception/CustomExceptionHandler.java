package com.tomoe.blog.nanamitomoeblogbe.exception;

import com.tomoe.blog.nanamitomoeblogbe.dto.common.ExceptionDto;
import com.tomoe.blog.nanamitomoeblogbe.dto.common.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class CustomExceptionHandler {
    // 개발자가 직접 정의한 예외
    @ExceptionHandler(value = {CustomException.class})
    public ResponseDto<?> handleApiException(CustomException e) {
        log.error("GlobalExceptionHandler catch CustomException : {}", e.getMessage());
        return ResponseDto.fail(e);
    }
}
