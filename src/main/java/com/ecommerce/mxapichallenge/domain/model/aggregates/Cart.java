package com.ecommerce.mxapichallenge.domain.model.aggregates;

import com.ecommerce.mxapichallenge.domain.model.entities.CartItem;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class Cart {
    @NotNull
    private CartId cartId;
    private List<CartItem> items;
}
