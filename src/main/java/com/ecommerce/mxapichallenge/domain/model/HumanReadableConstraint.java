package com.ecommerce.mxapichallenge.domain.model;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CartIdValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface HumanReadableConstraint {
    String message() default "Invalid CardId";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
