package com.example.ssb2.answer;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerForm {

    @NotEmpty(message = "내용은 필수 사항입니다.")
    String content;
}
