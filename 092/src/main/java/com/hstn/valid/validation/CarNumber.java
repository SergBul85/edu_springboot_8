package com.hstn.valid.validation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CarNumberValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CarNumber {

    public String value() default "USA";

    public String message() default "Car number must ends USA";


    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};


}
