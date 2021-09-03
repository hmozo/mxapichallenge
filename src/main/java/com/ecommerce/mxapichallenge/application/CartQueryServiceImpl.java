package com.ecommerce.mxapichallenge.application;

import com.ecommerce.mxapichallenge.domain.model.CartRepository;
import com.ecommerce.mxapichallenge.domain.model.aggregates.Cart;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartQueryServiceImpl implements CartQueryService{

    private final CartRepository cartRepository;

    public CartQueryServiceImpl(CartRepository cartRepository){

        this.cartRepository = cartRepository;
    }

    @Override
    public Optional<Cart> findCart(String cartId) {
        return cartRepository.findCart(cartId);
    }
}
