package com.epam.http.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Represents form parameter.
 * An example of usage:
 * <pre>
 *     {@code @FormParameter(name = "test", value = "test") }
 * </pre>
 *
 * @author <a href="mailto:roman.iovlev.jdi@gmail.com">Roman_Iovlev</a>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Repeatable(FormParameters.class)
public @interface FormParameter {
    String name();

    String value();
}
