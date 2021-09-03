package com.ecommerce.mxapichallenge.domain.model;

public class CartNotExistException extends RuntimeException{
    public CartNotExistException(String message) {
        super(message);
    }
}
