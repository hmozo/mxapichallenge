package com.ecommerce.mxapichallenge.application;

import com.ecommerce.mxapichallenge.domain.model.aggregates.Cart;
import com.ecommerce.mxapichallenge.domain.model.aggregates.CartId;

public interface CartCommandService {
    CartId saveCart(Cart cart);
}
