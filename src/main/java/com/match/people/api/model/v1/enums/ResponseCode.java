package com.match.people.api.model.v1.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseCode {
    SUCCESS("200", "성공", "정상입니다.")
    ;

    private final String code;
    private final String title;
    private final String message;
}
