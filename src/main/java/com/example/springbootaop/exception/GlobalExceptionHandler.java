package com.example.springbootaop.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException resourceNotFoundException,
            WebRequest webRequest) {

        ErrorDetails errorDetails = new ErrorDetails(new Date(), resourceNotFoundException.getMessage(),
                webRequest.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<?> gloableExceptionHandler(Exception ex, WebRequest webRequest) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
