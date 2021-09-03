package com.ecommerce.mxapichallenge.domain.model.valueobjects;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
@Data
public class SKU {
    @NotNull
    private String sku;
}
