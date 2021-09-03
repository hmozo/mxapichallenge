package com.ecommerce.mxapichallenge.application;

import com.ecommerce.mxapichallenge.domain.model.CartRepository;
import com.ecommerce.mxapichallenge.domain.model.aggregates.Cart;
import com.ecommerce.mxapichallenge.domain.model.aggregates.CartId;
import com.ecommerce.mxapichallenge.domain.model.exceptions.CartAlreadyExistsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CartCommandServiceImpl implements CartCommandService{

    private final CartRepository cargoRepository;

    public CartCommandServiceImpl(CartRepository cargoRepository){
        this.cargoRepository = cargoRepository;
    }

    @Override
    public CartId saveCart(Cart cart) {
        if(cargoRepository.findCart(cart.getCartId().getId()).isPresent()){
            throw new CartAlreadyExistsException("Cart already exists");
        }
        log.info("Saving cart " + cart.getCartId().getId());
        return cargoRepository.saveCart(cart);
    }
}
