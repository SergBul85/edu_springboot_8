package com.hstn.valid.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CarNumberValidator implements ConstraintValidator<CarNumber, String> {

    private String countryCode;


    @Override
    public void initialize(CarNumber carNumber) {
        countryCode = carNumber.value();
    }

    @Override
    public boolean isValid(String carNumber, ConstraintValidatorContext constraintValidatorContext) {

        boolean result = carNumber.endsWith(countryCode);
        return result;

    }
}
