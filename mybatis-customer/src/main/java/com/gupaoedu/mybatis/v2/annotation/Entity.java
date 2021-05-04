package com.gupaoedu.mybatis.v2.annotation;

import java.lang.annotation.*;

/**
 * 用于注解接口，以映射返回的实体类
 * @Author: qingshan
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Entity {
    Class<?> value ();
}
