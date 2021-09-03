package com.ecommerce.mxapichallenge.infrastructure.rest.exceptions;

import com.ecommerce.mxapichallenge.domain.model.CartAlreadyExistsException;
import com.ecommerce.mxapichallenge.domain.model.CartNotExistException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@Slf4j
public class CartRestControllerExceptionHandler
    extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CartAlreadyExistsException.class)
    public ResponseEntity<Object> onExistingCartException(CartAlreadyExistsException exception){
        log.info("CartAlreadyExistsException: " + exception);
        return handleExceptionInternal(exception,exception.getMessage(),null,HttpStatus.BAD_REQUEST,null);
    }

    @ExceptionHandler(CartNotExistException.class)
    public ResponseEntity<Object> onCartNotExistException(CartNotExistException exception){
        log.info("CartNotExistException: " + exception);
        return handleExceptionInternal(exception,exception.getMessage(),null,HttpStatus.BAD_REQUEST,null);
    }
}
