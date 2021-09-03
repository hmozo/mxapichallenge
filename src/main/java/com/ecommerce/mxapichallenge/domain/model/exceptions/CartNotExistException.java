package com.ecommerce.mxapichallenge.domain.model.exceptions;

public class CartNotExistException extends RuntimeException{
    public CartNotExistException(String message) {
        super(message);
    }
}
