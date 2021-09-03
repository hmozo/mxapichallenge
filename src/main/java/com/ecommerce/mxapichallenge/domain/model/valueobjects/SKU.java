package com.ecommerce.mxapichallenge.domain.model.valueobjects;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SKU {
    @NotNull
    private String sku;
}
