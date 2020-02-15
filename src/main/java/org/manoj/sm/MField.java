package org.manoj.sm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * SField annotation helps to map the source and target object vise versa.
 * 
 * @author Manoj Pawar
 * @version 1.0
 */
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MField {
   String value() default "";
}
