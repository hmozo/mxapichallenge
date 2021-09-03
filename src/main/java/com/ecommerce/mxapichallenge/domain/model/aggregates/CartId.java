package com.ecommerce.mxapichallenge.domain.model.aggregates;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class CartId {
    @Column(name = "cart_id", unique = true, updatable= false)
    private String id;
}
