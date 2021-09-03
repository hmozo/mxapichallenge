package com.ecommerce.mxapichallenge.infrastructure.repositories;

import com.ecommerce.mxapichallenge.domain.model.CartRepository;
import com.ecommerce.mxapichallenge.domain.model.aggregates.Cart;
import com.ecommerce.mxapichallenge.domain.model.aggregates.CartId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CartRepositoryImpl implements CartRepository {

    @Autowired
    private CartJpaRepository cartJpaRepository;

    @Autowired
    private CartItemJpaRepository cartItemJpaRepository;

    @Override
    public Optional<Cart> findCart(String cartId) {
        //return Optional.empty();
        return cartJpaRepository.findByCartIdId(cartId);
    }

    @Override
    public CartId saveCart(Cart cart) {
        cart.getItems().stream()
                .forEach(item->{cartItemJpaRepository.save(item);});

        Cart savedCart= cartJpaRepository.save(cart);
        return savedCart.getCartId();
    }
}
