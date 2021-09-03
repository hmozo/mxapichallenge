package com.ecommerce.mxapichallenge.application;

import com.ecommerce.mxapichallenge.domain.model.aggregates.Cart;

import java.util.Optional;

public interface CartQueryService {
    Optional<Cart> findCart(String cartId);
}
