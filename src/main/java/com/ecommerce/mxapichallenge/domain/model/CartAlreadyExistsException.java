package com.ecommerce.mxapichallenge.domain.model;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class CartAlreadyExistsException extends RuntimeException{
    public CartAlreadyExistsException(String message) {
        super(message);
    }
}
