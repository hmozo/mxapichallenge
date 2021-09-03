package com.ecommerce.mxapichallenge.infrastructure.rest.dto;

import com.ecommerce.mxapichallenge.domain.model.aggregates.CartId;
import com.ecommerce.mxapichallenge.domain.model.entities.CartItem;
import com.ecommerce.mxapichallenge.domain.model.HumanReadableConstraint;
import lombok.Data;

import java.util.List;

@Data
public class CartRequestDto {
    @HumanReadableConstraint
    private CartId cartId;
    private List<CartItem> items;
}
