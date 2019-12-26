package com.app.annotation;

import java.lang.annotation.*;

/**
 * @author Sergey Klunniy
 */
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Service {
    String name();

    boolean lazyLoad() default false;
}
