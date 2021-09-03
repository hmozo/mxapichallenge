package com.ecommerce.mxapichallenge.infrastructure.repositories;

import com.ecommerce.mxapichallenge.domain.model.CartRepository;
import com.ecommerce.mxapichallenge.domain.model.aggregates.Cart;
import com.ecommerce.mxapichallenge.domain.model.aggregates.CartId;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class CartRepositoryImpl implements CartRepository {

    private static List<Cart> carts= new ArrayList<>();

    @Override
    public Optional<Cart> findCart(String cartId) {
        return carts.stream().filter(
                cart->cart.getCartId().getId().equals(cartId)
        ).findFirst();
    }

    @Override
    public CartId saveCart(Cart cart) {
        carts.add(cart);
        return cart.getCartId();
    }
}
