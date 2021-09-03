package com.ecommerce.mxapichallenge.domain.model;

import com.ecommerce.mxapichallenge.domain.model.HumanReadableConstraint;
import com.ecommerce.mxapichallenge.domain.model.aggregates.CartId;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CartIdValidator implements
        ConstraintValidator<HumanReadableConstraint, CartId> {
    @Override
    public boolean isValid(CartId cartId, ConstraintValidatorContext context) {
        // TODO human-readable-id logic
        return cartId.getId().length()>2;
    }

    @Override
    public void initialize(HumanReadableConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
}
