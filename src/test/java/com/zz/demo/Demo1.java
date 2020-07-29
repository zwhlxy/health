package com.zz.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Properties;

/**
 * @Author zwh
 * @Date 2020/7/14 9:51
 * @Version 1.0
 **/
@SpringBootTest
public class Demo1 {


    @Test
    public void Test1() throws IOException {
        InputStream res = Demo1.class.getClassLoader().getResourceAsStream("data.properties");
        Properties pro = new Properties();
        pro.load(res);
        String ppt = pro.getProperty("ppt");
        System.out.println(ppt);
        assert res != null;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

        }
        res.close();
    }

    @Test
    public void Test2(){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println(loader);
        System.out.println(loader.getParent());
        System.out.println(loader.getParent().getParent());
        URL resource = Demo1.class.getClassLoader().getResource("");
    }

}
