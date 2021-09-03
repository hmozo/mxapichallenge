package com.ecommerce.mxapichallenge.domain.model.entities;

import com.ecommerce.mxapichallenge.domain.model.valueobjects.CartItemPrice;
import com.ecommerce.mxapichallenge.domain.model.valueobjects.SKU;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class CartItem {
    // TODO validation
    private SKU sku;
    @NotNull
    private String name;
    @NotNull
    private Double quantity;
    @NotNull
    private CartItemPrice price;

}
