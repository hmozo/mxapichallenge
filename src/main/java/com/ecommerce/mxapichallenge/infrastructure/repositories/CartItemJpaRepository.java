package com.ecommerce.mxapichallenge.infrastructure.repositories;

import com.ecommerce.mxapichallenge.domain.model.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemJpaRepository extends JpaRepository<CartItem, Long> {
}
