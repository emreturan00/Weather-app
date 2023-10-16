package com.dorileon.weather.controller.Validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;


@Documented
@Constraint(validatedBy = {CityNameValidator.class})
@Target({ METHOD, FIELD, PARAMETER})
@Retention(RUNTIME)
public @interface CityNameConstraint {

    String message() default "invalid city name";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
