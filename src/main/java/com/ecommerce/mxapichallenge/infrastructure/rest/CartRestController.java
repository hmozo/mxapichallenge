package com.ecommerce.mxapichallenge.infrastructure.rest;

import com.ecommerce.mxapichallenge.application.CartCommandService;
import com.ecommerce.mxapichallenge.application.CartQueryService;
import com.ecommerce.mxapichallenge.domain.model.aggregates.Cart;
import com.ecommerce.mxapichallenge.domain.model.aggregates.CartId;
import com.ecommerce.mxapichallenge.domain.model.exceptions.CartNotExistException;
import com.ecommerce.mxapichallenge.infrastructure.rest.dto.CartRequestDto;
import com.ecommerce.mxapichallenge.infrastructure.rest.dto.CartResponseDto;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/api/carts")
public class CartRestController {

    private final CartCommandService cartCommandService;
    private final CartQueryService cartQueryService;

    public CartRestController(CartCommandService cartCommandService, CartQueryService cartQueryService){
        this.cartCommandService= cartCommandService;
        this.cartQueryService = cartQueryService;
    }

    @GetMapping("/{cartId}")
    public ResponseEntity<CartResponseDto> getCart(@PathVariable String cartId){
        Optional<Cart> optionalCart= cartQueryService.findCart(cartId);
        if(!optionalCart.isPresent()){
            throw new CartNotExistException("Cart doesn't exist with id: " + cartId);
        }
        CartResponseDto cartResponseDto= new CartResponseDto();
        BeanUtils.copyProperties(optionalCart.get(),cartResponseDto);

        return ResponseEntity.ok(Optional.of(cartResponseDto)
                       .orElseThrow(()-> new ResponseStatusException((HttpStatus.NOT_FOUND))));
    }

    @PostMapping
    public ResponseEntity<CartId> createCart(@RequestBody @Valid CartRequestDto cartDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Request with incorrect data: ");
        }

        Cart cart= new Cart();
        BeanUtils.copyProperties(cartDto, cart);
        CartId cartId= cartCommandService.saveCart(cart);
        return ResponseEntity
                .created(URI.create("" + cartId.getId()))
                .body(cartId);
    }
}
