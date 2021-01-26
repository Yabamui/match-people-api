package com.match.people.api.utils;

import com.match.people.api.model.v1.Response;
import com.match.people.api.model.v1.enums.ResponseCode;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ResponseUtil {
    public static <T> ResponseEntity<Response<T>> getResponseEntity(T data) {
        return ResponseEntity.ok(Response.<T>builder()
                .code(ResponseCode.SUCCESS.getCode())
                .title(ResponseCode.SUCCESS.getTitle())
                .message(ResponseCode.SUCCESS.getMessage())
                .data(data)
                .build());
    }

    public static <T> ResponseEntity<Response<T>> getResponseEntity() {
        return ResponseEntity.ok(Response.<T>builder()
                .code(ResponseCode.SUCCESS.getCode())
                .title(ResponseCode.SUCCESS.getTitle())
                .message(ResponseCode.SUCCESS.getMessage())
                .build());
    }
}
