package com.tomoe.blog.nanamitomoeblogbe.dto.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tomoe.blog.nanamitomoeblogbe.exception.CustomException;
import io.micrometer.common.lang.Nullable;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;

public record ResponseDto<T>(
        @JsonIgnore HttpStatus httpStatus,
        @NotNull Boolean success,
        @Nullable T data,
        @Nullable ExceptionDto error
) {
    // 정상 응답
    public static <T> ResponseDto<T> ok(@Nullable final T data) {
        return new ResponseDto<>(HttpStatus.OK, true, data, null);
    }

    // 커스텀 에러 응답
    public static ResponseDto<Void> fail(final CustomException error) {
        return new ResponseDto<>(error.getErrorCode().getHttpStatus(),false, null, ExceptionDto.of(error.getErrorCode()));
    }
}
