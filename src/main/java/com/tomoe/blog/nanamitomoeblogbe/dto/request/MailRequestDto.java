package com.tomoe.blog.nanamitomoeblogbe.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record MailRequestDto(
        @NotBlank(message = "이메일을 입력해야 합니다.") // null, "", " " 모두 허용하지 않음.
        @Email(message = "올바른 이메일 형식이 아닙니다.")
        String email,

        @NotBlank(message = "이름을 입력해야 합니다.")
        String name,

        @NotBlank(message = "내용을 입력해야 합니다.")
        String message
) {
}
