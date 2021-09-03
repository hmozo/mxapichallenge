package com.ecommerce.mxapichallenge.infrastructure.rest.dto;

import com.ecommerce.mxapichallenge.domain.model.aggregates.CartId;
import com.ecommerce.mxapichallenge.domain.model.entities.CartItem;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class CartResponseDto {
    private CartId cartId;
    private List<CartItem> items;
}
