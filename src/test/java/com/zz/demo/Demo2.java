package com.zz.demo;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author zwh
 * @Date 2020/7/17 14:36
 * @Version 1.0
 **/
public class Demo2 {

    @Test
    public void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> class1 = Class.forName("com.zz.demo.User");
        System.out.println("class1 = " + class1);
        System.out.println(class1.getName());
        System.out.println(class1.getSimpleName());
        Object obj = class1.newInstance();
        System.out.println("obj = " + obj);//constructor
//        Constructor<?>[] con = class1.getConstructors();
//        for (Constructor<?> constructor : con) {
//            System.out.println("constructor = " + constructor);
//        }
//        Constructor<?>[] con = class1.getDeclaredConstructors();
//        for (Constructor<?> constructor : con) {
//            System.out.println("constructor = " + constructor);
//        }
//        Constructor<?> constructor = class1.getConstructor(String.class,Integer.class);
//        constructor.setAccessible(true);
//        Object obj1 = constructor.newInstance("小明", 23);
//        System.out.println("obj1 = " + obj1);
        Method[] methods = class1.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

    }

    @Test
    public void test2() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<User> aClass = User.class;
        Method method = aClass.getMethod("pay", String.class);
        User user = aClass.newInstance();
        method.invoke(user,"房玉政");
        Field[] fields = aClass.getDeclaredFields();
        System.out.println(fields);
        String key = "玉政";
//        Arrays.stream(fields).filter(field -> field.getName().equals(key)).findFirst().get();

    }

    @Test
    public void test3() throws Exception {
        ClassLoader classLoader = User.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);
        Class<?> aClass = Class.forName("com.zz.demo.User");
        System.out.println("aClass = " + aClass);
        Object obj = aClass.newInstance();
        Constructor<?> constructor = aClass.getConstructor();
        constructor.setAccessible(true);
    }

}
