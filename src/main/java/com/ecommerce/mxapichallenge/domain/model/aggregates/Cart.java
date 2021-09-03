package com.ecommerce.mxapichallenge.domain.model.aggregates;

import com.ecommerce.mxapichallenge.domain.model.entities.CartItem;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Cart {
    @Id
    private String id;
    @Embedded
    private CartId cartId;
    @OneToMany
    private List<CartItem> items;
}
