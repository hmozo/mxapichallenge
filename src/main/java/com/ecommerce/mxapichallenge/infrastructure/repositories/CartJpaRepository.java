package com.ecommerce.mxapichallenge.infrastructure.repositories;

import com.ecommerce.mxapichallenge.domain.model.aggregates.Cart;
import com.ecommerce.mxapichallenge.domain.model.aggregates.CartId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CartJpaRepository extends JpaRepository<Cart, String> {

    //@Query("select c from Cart c where c.cartId.id = ?cartId")
    Optional<Cart> findByCartIdId(String cartId);

}
