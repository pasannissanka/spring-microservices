package com.solvedcard.beans.dtos.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseData<T, E> {
    private T data;
    private String message;
    private boolean success;
    private E error;

    public static <T, E> ResponseData<T, E> success(T data, String message) {
        return ResponseData.<T, E>builder()
                .data(data)
                .message(message)
                .success(true)
                .build();
    }

    public static <T, E> ResponseData<T, E> error(E error, String message) {
        return ResponseData.<T, E>builder()
                .error(error)
                .message(message)
                .success(false)
                .build();
    }
}
