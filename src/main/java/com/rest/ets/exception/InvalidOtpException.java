package com.rest.ets.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InvalidOtpException extends RuntimeException{
    private String message;

    @Override
    public String getMessage() {
        return message;
    }
}