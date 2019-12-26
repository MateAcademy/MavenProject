package com.app.annotation;

import java.lang.annotation.*;

/**
 * @author Sergey Klunniy
 */
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Init {
    boolean suppresException() default false;
}
