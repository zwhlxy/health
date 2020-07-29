package com.zz.demo2;

import java.lang.annotation.*;

/**
 * @Author zwh
 * @Date 2020/7/21 15:51
 * @Version 1.0
 **/
@Documented//作用于javadoc
@Inherited//可继承
@Target({ElementType.FIELD,ElementType.METHOD})//注解可作用的地方：field 字段 method 方法
@Retention(RetentionPolicy.RUNTIME)//存活阶段：Runtime：存在与运行期。还有jvm，class文件级别
@interface Person {
    String value();
    int age() default 18;
    char sex();
}
