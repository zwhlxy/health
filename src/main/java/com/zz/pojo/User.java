package com.zz.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author zwh
 * @Date 2020/7/7 10:56
 * @Version 1.0
 **/
@Component
public class User implements Serializable {

    @Value("${user.names}")
    private String name;
    @Value("${user.age}")
    private Integer age;
    @Value("${user.address}")
    private String address;
    public  final Integer newAge=18;

    public Integer getNewAge() {
        return newAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
