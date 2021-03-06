package com.springboot.boot.web.annotation;

import java.lang.annotation.*;

/**
 * a mark annotation to binding {@link User#id} to spring mvc
 * method parameter
 *
 * @author liubo
 * @since 1.2
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface CurrentUserId {

    boolean required() default true;

}
