package com.zz.demo2;

import com.zz.pojo.User;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author zwh
 * @Date 2020/7/21 15:54
 * @Version 1.0
 **/
public class Demo1 {

    @Test
    @Person(value = "房玉政", sex = '男')
    public void info() throws NoSuchFieldException, IllegalAccessException {
//        Method[] methods = Demo1.class.getMethods();
//        for (Method method : methods) {
//            System.out.println("method = " + method);
//        }
        Field age = User.class.getField("newAge");
        System.out.println("age = " + age);
        age.setAccessible(true);
        Date date = new Date();
        age.set(age.getName(),new Integer(25));
        User user = new User();
        System.out.println(user.newAge);

    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
//        demo1.info();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String format1 = format.format(new Date());
        System.out.println("format1 = " + format1);
    }
}
