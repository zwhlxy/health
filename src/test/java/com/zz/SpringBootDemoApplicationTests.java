package com.zz;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Properties;

@SpringBootTest
class SpringBootDemoApplicationTests {

    @Test
    void contextLoads() {
        Properties pro = new Properties();
        System.out.println(pro.getProperty("ppt","111"));
    }

}
