package com.ecommerce.mxapichallenge.domain.model;

import com.ecommerce.mxapichallenge.domain.model.aggregates.Cart;
import com.ecommerce.mxapichallenge.domain.model.aggregates.CartId;

import java.util.Optional;

public interface CartRepository {
    Optional<Cart> findCart(String cartId);
    CartId saveCart(Cart cart);
}
