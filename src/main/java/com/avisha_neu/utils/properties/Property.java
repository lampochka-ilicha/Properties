package com.avisha_neu.utils.properties;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Tatyana.Kalnitskaya on 26.10.2015.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Property {
    String value();
}
