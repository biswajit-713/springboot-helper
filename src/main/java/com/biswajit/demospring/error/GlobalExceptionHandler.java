package com.biswajit.demospring.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidCountException.class)
    public ResponseEntity<ErrorResponse> handleInvalidCountException(InvalidCountException ex) {
        ErrorResponse errorResponse = new ErrorResponse(ex.getMessage(), ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }
}
