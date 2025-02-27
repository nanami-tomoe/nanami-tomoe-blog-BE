package com.tomoe.blog.nanamitomoeblogbe.exception;

import com.tomoe.blog.nanamitomoeblogbe.dto.common.ExceptionDto;
import com.tomoe.blog.nanamitomoeblogbe.dto.common.ResponseDto;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    // ✅ 개발자가 정의한 예외 처리
    @ExceptionHandler(CustomException.class)
    public ResponseDto<Void> handleCustomException(CustomException e) {
        log.error("CustomException 발생: {}", e.getMessage());
        return ResponseDto.fail(e);
    }

    // ✅ @Valid 유효성 검사 실패 예외 처리
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseDto<Void> handleValidationException(MethodArgumentNotValidException e) {
        String errorMessage = e.getBindingResult().getFieldErrors()
                .stream()
                .map(error -> error.getField() + ": " + error.getDefaultMessage())
                .findFirst() // 첫 번째 에러 메시지만 반환
                .orElse("잘못된 요청입니다.");

        log.error("ValidationException 발생: {}", errorMessage);
        return new ResponseDto<>(HttpStatus.BAD_REQUEST, false, null, ExceptionDto.of(4000, "잘못된 요청", errorMessage));
    }

    // ✅ @RequestParam, @PathVariable 검증 실패 예외 처리
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseDto<Void> handleConstraintViolationException(ConstraintViolationException e) {
        log.error("ConstraintViolationException 발생: {}", e.getMessage());
        return new ResponseDto<>(HttpStatus.BAD_REQUEST, false, null, ExceptionDto.of(4001, "잘못된 요청 파라미터", e.getMessage()));
    }
}
