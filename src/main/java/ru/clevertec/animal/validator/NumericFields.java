package ru.clevertec.animal.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NumericFields {
    double min() default 0.0000000001;
    double max() default Double.POSITIVE_INFINITY;
}
