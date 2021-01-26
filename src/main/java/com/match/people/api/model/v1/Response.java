package com.match.people.api.model.v1;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Response <T> {
    private final String code;
    private final String title;
    private final String message;
    private final T data;
}
