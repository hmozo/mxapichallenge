package com.ecommerce.mxapichallenge.domain.model.entities;

import com.ecommerce.mxapichallenge.domain.model.aggregates.Cart;
import com.ecommerce.mxapichallenge.domain.model.valueobjects.CartItemPrice;
import com.ecommerce.mxapichallenge.domain.model.valueobjects.SKU;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
public class CartItem {
    @Id
    private Long cartItemId;
    @Embedded
    private SKU sku;
    @NotNull
    private String name;
    @NotNull
    private Double quantity;
    @Embedded
    private CartItemPrice price;
}
